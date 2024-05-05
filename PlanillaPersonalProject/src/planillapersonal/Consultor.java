/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillapersonal;

/**
 *
 * @author Pc-Cenpro
 */
public class Consultor extends Trabajador{
    private double bonificacion;
    
    public Consultor(String codigo, String nombre, double basico, double bonificacion){
        super(codigo,nombre,basico);
        this.bonificacion=bonificacion;
    }
    /**
     * @return the bonificacion
     */
    public double getBonificacion() {
        return bonificacion;
    }

    /**
     * @param bonificacion the bonificacion to set
     */
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void calcularNeto() {
        setNeto(getBasico()-getRetenciones()+bonificacion);
    }
    
    
}
