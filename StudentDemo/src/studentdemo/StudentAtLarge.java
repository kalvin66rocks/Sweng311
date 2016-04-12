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
public class StudentAtLarge extends Student {
    private double tuition;
    
    //constructor for a student at large
    public StudentAtLarge(int phone_number, String last_name)
    {
        super(phone_number,last_name);
    }
    //overriden function that sets the tuition
    @Override
    public void setTuition()
    {
        this.tuition = 2000;
    }
    //overriden method that gets the tuition
    @Override
    public double getTuition()
    {
        return tuition;
    }
    //overriden to string method
    @Override
    public String toString()
    {
        return String.format("Student at Large: Last name %s phone number %d tuition %.2f ",super.getName(), super.getPhone(), tuition);
    }
    
}
