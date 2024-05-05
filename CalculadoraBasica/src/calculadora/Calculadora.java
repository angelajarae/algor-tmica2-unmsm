package calculadora;

public class Calculadora {

    private int acumulador;
    private int operando;
    private int visor;
    private int operadorAnterior;
    
    public Calculadora(){
        acumulador=0;
        operando=0;
        visor=0;
        operadorAnterior=0;
    }
    public void borrar(){
        operando=0;
        visor=0;
    }
    public void borrarTodo(){
        acumulador=0;
        operando=0;
        visor=0;
        operadorAnterior=0;
    }
    public void retroceder(){
        if(visor==acumulador){
            String acumuladorStr=String.valueOf(acumulador);
        
            acumuladorStr=acumuladorStr.substring(0, acumuladorStr.length()-1);
            acumulador=Integer.parseInt(acumuladorStr);
            visor=acumulador;
            System.out.println(visor);
            System.out.println(acumulador);
        }
        if(visor==operando){
            String operandoStr=String.valueOf(operando);
        
            operandoStr=operandoStr.substring(0, operandoStr.length()-1);
            operando=Integer.parseInt(operandoStr);
            visor=operando;

        }
        
    }
    public void operar(int signo){
        
        if(operadorAnterior==0){
            operadorAnterior=signo;
            acumulador=operando;
          
            visor=acumulador;
           
            operando=0;
            
        }
        else{
            switch(operadorAnterior){
                case 1:
                    acumulador=acumulador+operando;
                    break;
                case 2:
                    acumulador=acumulador-operando;
                    break;
                case 3:
                    acumulador=acumulador*operando;
                    break;
                case 4:
                    acumulador=acumulador/operando;
                    break;
                case 6:
                    acumulador=acumulador*operando/100;
                    break;
                case 7:
                    int base=acumulador;
                    for(int i=1;i<operando;i++){
                        acumulador=acumulador*base;
                    }
                    break;
            }
            
            if(signo==5){
                operadorAnterior=0; 
                operando=acumulador;
                visor=operando;
                acumulador=0;
                
   
            }
            else{
                operadorAnterior=signo;
                visor=acumulador;
                operando=0;
            }
        }

        
        
        
    }
    public void ingresarValor(int valor){
        int digitos=0;
        int num=operando;
        
        if(operando==0){
            operando=valor;
                
        }
        else{
            while(num!=0){
                num=num/10;
                digitos++;
            }
            if(digitos<10){

                operando=operando*10+valor;

            
            }
        }
    
        visor=operando;
        
    }
    public String mostrarValor(){
        return String.valueOf(visor);
    }

    /**
     * @return the acumulador
     */
    public int getAcumulador() {
        return acumulador;
    }

    /**
     * @param acumulador the acumulador to set
     */
    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    /**
     * @return the operando
     */
    public int getOperando() {
        return operando;
    }

    /**
     * @param operando the operando to set
     */
    public void setOperando(int operando) {
        this.operando = operando;
    }

    /**
     * @return the visor
     */
    public int getVisor() {
        return visor;
    }

    /**
     * @param visor the visor to set
     */
    public void setVisor(int visor) {
        this.visor = visor;
    }

    /**
     * @return the operadorAnterior
     */
    public int getOperadorAnterior() {
        return operadorAnterior;
    }

    /**
     * @param operadorAnterior the operadorAnterior to set
     */
    public void setOperadorAnterior(int operadorAnterior) {
        this.operadorAnterior = operadorAnterior;
    }

    
}
