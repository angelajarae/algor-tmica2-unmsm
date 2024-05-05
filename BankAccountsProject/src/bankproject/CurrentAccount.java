/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

/**
 *
 * @author AULAFISI
 */
public class CurrentAccount extends Account {
    private double _overdraft;
    
    public CurrentAccount(String number,String clientName,double balance){
        super(number,clientName,balance);
        _overdraft=getBalance()*2;
    }
    
    public CurrentAccount(String number,String clientName,double balance,double overdraft){
        super(number,clientName,balance);
        _overdraft=overdraft;
    }

    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance()+amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount<=getBalance()+_overdraft){
            if(amount<=getBalance()){
                setBalance(getBalance()-amount);
            }
            else{
                setOverdraft(_overdraft-(amount-getBalance()));
                setBalance(0);
            }
            
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean calculateInterest(double percentage) {
        setBalance(getBalance()+getBalance()*percentage);
        return true;
    }
    
    public boolean calculateMaintenance (double percentage){
        setBalance(getBalance()-getBalance()*percentage);
        return true;
    }

    /**
     * @return the _overdraft
     */
    public double getOverdraft() {
        return _overdraft;
    }

    /**
     * @param _overdraft the _overdraft to set
     */
    public void setOverdraft(double _overdraft) {
        this._overdraft = _overdraft;
    }
    
    
}
