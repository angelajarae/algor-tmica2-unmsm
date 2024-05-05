/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

import java.time.LocalDate;

/**
 *
 * @author angela
 */
public class SavingsAccount extends Account{
    private int _monthPeriods;
    private LocalDate _expirationDate=LocalDate.now(); 

    public SavingsAccount(String number, String clientName, double balance) {
        super(number, clientName, balance);
        _monthPeriods=6;
        _expirationDate=_expirationDate.plusMonths(_monthPeriods);
    }
    
    public SavingsAccount(String number, String clientName, double balance, int periodo) {
        super(number, clientName, balance);
        _monthPeriods=periodo;
        _expirationDate=_expirationDate.plusMonths(_monthPeriods);
    }

    
    @Override
    public boolean deposit(double amount) {
        LocalDate today=LocalDate.now();
        
        if(today.isBefore(_expirationDate)){
            setBalance(getBalance()+amount);
            return true;
        }
        else{
            return false;
        }      
    }

    @Override
    public boolean withdraw(double amount) {
        LocalDate today=LocalDate.now();
        
        if(today.isBefore(_expirationDate)){
            if(getBalance()>=amount){
                setBalance(getBalance()-amount);
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

    @Override
    public boolean calculateInterest(double percentage) {
        LocalDate today=LocalDate.now();
        
        if(today.isBefore(_expirationDate)){
            setBalance(getBalance()+getBalance()*percentage);
            return true;
        }
        else{
            return false;
        }   
    }

    /**
     * @return the _monthPeriods
     */
    public int getMonthPeriods() {
        return _monthPeriods;
    }

    /**
     * @param _monthPeriods the _monthPeriods to set
     */
    public void setMonthPeriods(int _monthPeriods) {
        this._monthPeriods = _monthPeriods;
    }

    /**
     * @return the _expirationDate
     */
    public LocalDate getExpirationDate() {
        return _expirationDate;
    }

    /**
     * @param _expirationDate the _expirationDate to set
     */
    public void setExpirationDate(LocalDate _expirationDate) {
        this._expirationDate = _expirationDate;
    }

    
}
