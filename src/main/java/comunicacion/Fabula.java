/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;

/**
 *
 * @author paula
 */
public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;
    
    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    
    @Override
    public int palabrasTotales(int y){
        return y*getPaginas();
    }
    
    @Override
    public String interpretacion(){
        return this.interpretacion;
    }
    
    @Override
    public String toString(){
        return getOrigen() + "/n" + getTitulo() + "/n" + getAutor() + "/n" + getPaginas() + "/n" + getEnsenanza();
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
