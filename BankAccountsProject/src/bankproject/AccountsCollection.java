/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

import java.util.ArrayList;

/**
 *
 * @author AULAFISI
 */
public class AccountsCollection {
    private ArrayList<Account> _accounts;
    private int nAccounts;
    
    public AccountsCollection(){
        _accounts= new ArrayList<Account>();
        nAccounts=0;
    }

    public boolean addAccount(Account account){
        setnAccounts(getnAccounts() + 1);
        
        getAccounts().add(account);
        return true;
    }
    
    public Account findAccount(String number){
        for(int i=0;i<_accounts.size();i++){
            Account account=_accounts.get(i);
            
            if(account.getNumber().equals(number)){
                return(account);
            }
        }
        
        return null;
    }
    
    public void updateAccount(Account updatedAccount){
        for(int i=0;i<_accounts.size();i++){
            Account account=_accounts.get(i);
            
            if(account.getNumber().equals(updatedAccount.getNumber())){
                _accounts.remove(account);
                _accounts.add(updatedAccount);
            } 
        }
    }

    /**
     * @return the _accounts
     */
    public ArrayList<Account> getAccounts() {
        return _accounts;
    }

    /**
     * @param _accounts the _accounts to set
     */
    public void setAccounts(ArrayList<Account> _accounts) {
        this._accounts = _accounts;
    }

    /**
     * @return the nAccounts
     */
    public int getnAccounts() {
        return nAccounts;
    }

    /**
     * @param nAccounts the nAccounts to set
     */
    public void setnAccounts(int nAccounts) {
        this.nAccounts = nAccounts;
    }
    
    
    

}
