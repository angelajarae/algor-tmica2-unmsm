/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human_resources;

/**
 *
 * @author angela
 */
public class Person {
    private int _code;
    private String _firstName;
    private String _lastName;
    private String _address;
    
    public Person(int code, String first, String last, String address)
    {
        _code = code;
        _firstName = first;
        _lastName = last;
        _address = address;
    }
    
    /**
     * @return the _code
     */
    public int getCode() {
        return _code;
    }

    /**
     * @param _code the _code to set
     */
    public void setCode(int _code) {
        this._code = _code;
    }

    /**
     * @return the _firstName
     */
    public String getFirstName() {
        return _firstName;
    }

    /**
     * @param _firstName the _firstName to set
     */
    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    /**
     * @return the _lastName
     */
    public String getLastName() {
        return _lastName;
    }

    /**
     * @param _lastName the _lastName to set
     */
    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }

    /**
     * @return the _address
     */
    public String getAddress() {
        return _address;
    }

    /**
     * @param _address the _address to set
     */
    public void setAddress(String _address) {
        this._address = _address;
    }
    
    
    
}
