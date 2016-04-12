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
public class GraduateStudent extends Student {
    private double tuition;
    
    //constructor for graduatestudent
    public GraduateStudent(int phone_number, String last_name)
    {
        super(phone_number,last_name);
    }
    //overriden method to set the tuition
    @Override
    public void setTuition()
    {
        this.tuition = 6000;
    }
    //overriden mwthod to get the tuition
    @Override
    public double getTuition()
    {
        return tuition;
    }
    //overriden to string method
    @Override
    public String toString()
    {
        return String.format("Graduate Student: Last name %s phone number %d tuition %.2f ",super.getName(), super.getPhone(), tuition);
    }
    
}
