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
public class PersonCollection {
    private Vector _persons;
    
    public PersonCollection()
    {
        _persons = new Vector();
    }
    
    public boolean addPerson(int code, String name, String last, String address, double credit) {
        Person person = new Client(code, name, last, address, credit);
        _persons.add(person);
        return true;
    }
    
    public boolean addPerson(int code, String name, String last, String address, double salary, Date hireDate) {
        Person person = new Employee(code, name, last, address, salary, hireDate);
        _persons.add(person);
        return true;
    }
    
    public String showPerson() {
        String message = "";

        for (Object person: _persons) {
            if (person != null) {
                message = message + " Code: " + ((Person) person).getCode() +
                " First Name: " + ((Person) person).getFirstName() +
                " Last Name: " + ((Person) person).getLastName() +
                " Address: " + ((Person) person).getAddress();
                
                if (person instanceof Client) {
                    message = message + " Credit: " + ((Client) person).getCredit() + "\n";
                } 
                else {
                    message = message + " Salary: " + ((Employee) person).getSalary() +
                    " Hire Date: " + ((Employee) person).getHireDate() + "\n";
                }
            }
        }
        return message;
    }
}