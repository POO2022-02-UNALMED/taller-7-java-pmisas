/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;
import java.util.*;
/**
 *
 * @author paula
 */
public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;
    
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
    }

    @Override
    public String interpretacion(){
        return this.interpretacion;
    }
    
    public int cantidadLetras(){
        return this.letras.length;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(letras).replace("[","").replace("]","");
    }
    
    
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
