/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author Kevin Brenneman
 */
public abstract class Student {
    private int phone_number;
    private String last_name;
    
    //connstructor
    public Student(int phone_number, String last_name)
    {
        this.last_name = last_name;
        this.phone_number = phone_number;  
    }
    //set phone number
    public void setPhone(int number)
    {
        this.phone_number = number;
    }
    //set last name
    public void setName(String name)
    {
        this.last_name = name;
    }
    //get phone number
    public int getPhone()
    {
        return phone_number;
    }
    //get last name
    public String getName()
    {
        return last_name;
    }
    
    //abstract methods to be overrridden in subclasses
    abstract double getTuition();
    abstract void setTuition();
    
    //overriden abstract to string method
    @Override
    public abstract String toString();
}

