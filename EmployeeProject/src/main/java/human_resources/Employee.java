/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human_resources;
import java.util.*;

/**
 *
 * @author angela
 */
public class Employee extends Person {
    private double _salary;
    private Date _hireDate;
    
    public Employee(int code, String first, String last, String address, double salary, Date hireDate)
    {
        super(code, first, last, address);
        _salary = salary;
        _hireDate = hireDate;
    }

    /**
     * @return the _salary
     */
    public double getSalary() {
        return _salary;
    }

    /**
     * @param _salary the _salary to set
     */
    public void setSalary(double _salary) {
        this._salary = _salary;
    }

    /**
     * @return the _hireDate
     */
    public Date getHireDate() {
        return _hireDate;
    }

    /**
     * @param _hireDate the _hireDate to set
     */
    public void setHireDate(Date _hireDate) {
        this._hireDate = _hireDate;
    }
}
