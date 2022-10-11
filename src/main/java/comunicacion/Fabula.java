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
    private String enseñanza;
    private String interpretacion;
    
    public Fabula(String origen, String titulo, String autor, int paginas,String enseñanza, String intrpretacion){
        super(origen, titulo, autor, paginas);
        enseñanza = this.enseñanza;
        interpretacion = this.interpretacion;
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
        return getOrigen() + "/n" + getTitulo() + "/n" + getAutor() + "/n" + getPaginas() + "/n" + enseñanza;
    }

    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
