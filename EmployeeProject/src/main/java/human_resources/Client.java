/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human_resources;

/**
 *
 * @author angela
 */
public class Client extends Person{
    private double _credit;
    
    public Client(int code, String first, String last, String address, double credit)
    {
        super(code, first, last, address);
        _credit = credit;
    }

    /**
     * @return the _credit
     */
    public double getCredit() {
        return _credit;
    }

    /**
     * @param _credit the _credit to set
     */
    public void setCredit(double _credit) {
        this._credit = _credit;
    }
}
