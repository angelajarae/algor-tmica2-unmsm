/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillapersonal;

/**
 *
 * @author Pc-Cenpro
 */
public abstract class Trabajador {
    private String codigo;
    private String nombre;
    private double basico;
    private double retenciones;
    private double neto;
    
    public Trabajador ( String codigo, String nombre, double basico){
        this.codigo=codigo;
        this.nombre=nombre;
        this.basico=basico;
        retenciones=0;
        neto=0;
    }
    public void calcularRetenciones (double tasa){
        retenciones=basico*tasa;
    }
    public  abstract void calcularNeto();
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the basico
     */
    public double getBasico() {
        return basico;
    }

    /**
     * @param basico the basico to set
     */
    public void setBasico(double basico) {
        this.basico = basico;
    }

    /**
     * @return the retenciones
     */
    public double getRetenciones() {
        return retenciones;
    }

    /**
     * @param retenciones the retenciones to set
     */
    public void setRetenciones(double retenciones) {
        this.retenciones = retenciones;
    }

    /**
     * @return the neto
     */
    public double getNeto() {
        return neto;
    }

    /**
     * @param neto the neto to set
     */
    public void setNeto(double neto) {
        this.neto = neto;
    }
    
}
