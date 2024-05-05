/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillapersonal;

/**
 *
 * @author Pc-Cenpro
 */
public class Empleado extends Trabajador {
    private int diasFaltas;
    private double descuentos;
    private int horasExtras;
    
    public Empleado(String codigo, String nombre, double basico,int diasFaltas,int horasExtras){
        super(codigo,nombre,basico);
        this.diasFaltas=diasFaltas;
        this.horasExtras=horasExtras;
        descuentos=0;
        
    }
    public void calcularDescuento(){
        descuentos=(getBasico()/30)*diasFaltas;
    }
    public double calcularSueldoHoraExtra(int horas){
        return ((getBasico()/30)/8 *1.5);
    }
    @Override
    public void calcularNeto(){
        setNeto(getBasico()+horasExtras*calcularSueldoHoraExtra(horasExtras)-descuentos-getRetenciones());
    }
    /**
     * @return the diasFaltas
     */
    public int getDiasFaltas() {
        return diasFaltas;
    }

    /**
     * @param diasFaltas the diasFaltas to set
     */
    public void setDiasFaltas(int diasFaltas) {
        this.diasFaltas = diasFaltas;
    }

    /**
     * @return the descuentos
     */
    public double getDescuentos() {
        return descuentos;
    }

    /**
     * @param descuentos the descuentos to set
     */
    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    /**
     * @return the horasExtras
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
}
