/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;

/**
 *
 * @author paula
 */
public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;
    
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        fecha=this.fecha;
        primicia=this.primicia;
        interpretacion=this.interpretacion;
    }
    
    @Override
    public int palabrasTotales(int q){
        return q*getPaginas()*10;
    }
    
    @Override
    public String interpretacion(){
        return this.interpretacion;
    }
    
    @Override
    public String toString(){
        return getOrigen() + "/n" + getTitulo() + "/n" + getAutor() + "/n" + getPaginas()+ "/n" + fecha + "/n" + primicia;
    }
    
}
