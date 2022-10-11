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
        this.fecha=fecha;
        this.primicia=primicia;
        this.interpretacion=interpretacion;
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
        return super.getOrigen() + "/n" + super.getTitulo() + "/n" + super.getAutor() + "/n" + super.getPaginas()+ "/n" + fecha + "/n" + primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
}
