/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnosproject;

/**
 *
 * @author angela
 */
public class Lista {
    private Nodo inicio;
    
    public Lista(){
        this.inicio=null;
    }
    public int longitud(){
        int num=0;
        Nodo ptr=inicio;
        
        while(ptr!=null){
            num++;
            ptr=ptr.getSiguiente();
        }
        return num;
    }
    public boolean existe(String codigo){
        Nodo ptr=inicio;
        
        while(ptr!=null && !ptr.getCodigo().equals(codigo)){
            ptr=ptr.getSiguiente();
        }
        if(ptr==null){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean agregarInicio(String codigo, String nombre){
        if(existe(codigo)==false){
            Nodo nuevoNodo=new Nodo(nombre,codigo);
            nuevoNodo.setSiguiente(inicio);
            inicio=nuevoNodo;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean agregarFinal(String codigo, String nombre){
        if(existe(codigo)==false){
            Nodo nuevoNodo=new Nodo(nombre,codigo);
            if(inicio==null){
                inicio=nuevoNodo;
            }
            else{
                Nodo ptr=inicio;
                while(!(ptr.getSiguiente()==null)){
                    ptr=ptr.getSiguiente();
                }
                ptr.setSiguiente(nuevoNodo);
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean insertarNodo(String codigo, String nombre, int posicion){
        if(posicion<=longitud()){
            if(!existe(codigo)){
                Nodo nuevoNodo=new Nodo(nombre,codigo);
                Nodo nodo1=inicio;
                Nodo nodo2=inicio;
                
                for(int i=1;i<posicion;i++){
                    nodo1=nodo2;
                    nodo2=nodo2.getSiguiente();
                }
                
                if(nodo1==inicio){
                    nuevoNodo.setSiguiente(inicio);
                    inicio=nuevoNodo;
                }
                else{
                    nodo1.setSiguiente(nuevoNodo);
                    nuevoNodo.setSiguiente(nodo2);
                }
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public boolean eliminarNodoCod(String codigo){
        if(existe(codigo)){
            Nodo nodo1=inicio;
            Nodo nodo2=inicio;
            
            while(!nodo2.getCodigo().equals(codigo)){
                nodo1=nodo2;
                nodo2=nodo2.getSiguiente();
            }
            
            if(nodo2.equals(inicio)){
                inicio=inicio.getSiguiente();
            }
            else{
                nodo1.setSiguiente(nodo2.getSiguiente());
            }
            return true;
        }
        else{
            return false;
        }
    }
    public String mostrarCadena(){
        StringBuilder cadena=new StringBuilder("");
        Nodo ptr=inicio;
        while(ptr!=null){
            cadena=cadena.append("Codigo: ").append(ptr.getCodigo()).append("\n");
            cadena=cadena.append("Nombre: ").append(ptr.getNombre()).append("\n\n");
            ptr=ptr.getSiguiente();
        }
        return (cadena.toString());
    }
    public boolean liberarLista(){
        Nodo ptr=inicio;
        Nodo aux=inicio;
        while(ptr!=null){
            aux=ptr;
            ptr=ptr.getSiguiente();
            aux=null;
        }
        return true;
    }
    public String buscarNodoCod(String codigo){
        Nodo ptr=inicio;
        while(ptr!=null){
            if(ptr.getCodigo().equals(codigo)){
                return ptr.getNombre().toString();
            }
            ptr=ptr.getSiguiente();
        }
        return null;
        
    }
    public String buscarNodoNomb(String nombre){
        Nodo ptr=inicio;
        while(ptr!=null){
            if(ptr.getNombre().equals(nombre)){
                return ptr.getCodigo().toString();
            }
            ptr=ptr.getSiguiente();
        }
        return null;
        
    }
    public boolean modificarNombre(String codigo, String nuevoNombre){
        Nodo ptr=inicio;
        while(ptr!=null){
            if(ptr.getCodigo().equals(codigo)){
                ptr.setNombre(nuevoNombre);
                return true;
            }
            ptr=ptr.getSiguiente();
        }
        return false;
    }
    public boolean eliminarNodoPos(int posicion){
        if(posicion<=longitud()){
            Nodo ptr=inicio;
            Nodo aux=inicio;
            if(posicion==1){
                inicio=ptr.getSiguiente();
                return true;
            }
            for(int i=1;i<=longitud();i++){
                if(i==posicion){
                    aux.setSiguiente(ptr.getSiguiente());
                    break;
                }
                aux=ptr;
                ptr=ptr.getSiguiente();
            }
            
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    
    
}
