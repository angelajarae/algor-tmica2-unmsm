package calculadora;


public class CalculadoraConMemoria extends Calculadora {
    private int memoria;
    
    public CalculadoraConMemoria(){
        super();
        memoria=0;
    }
    
    public void guardarMemoria(){
        memoria=getOperando();
    }
    public void sumarMemoria(){
        memoria=memoria+getOperando();
    }
    public void borrarMemoria(){
        memoria=0;
    }
    public String mostrarMemoria(){
        return String.valueOf(memoria);
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
