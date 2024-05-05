/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillapersonal;

/**
 *
 * @author angela
 */
public class RangoException extends ArrayIndexOutOfBoundsException {
    String mensaje;
    
    public RangoException( String mensaje){
        this.mensaje=mensaje;
    }
    
    public String mostrar(){
        return(mensaje);
    }
}
