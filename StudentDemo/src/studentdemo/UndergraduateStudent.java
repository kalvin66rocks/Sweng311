/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author kalvi_000
 */
public class UndergraduateStudent extends Student {
    private double tuition;
    
    //constructor for undergraduate student
    public UndergraduateStudent(int phone_number, String last_name)
    {
        super(phone_number,last_name);
    }
    //overridden method to set the tuition
    @Override
    public void setTuition()
    {
        this.tuition = 4000;
    }
    //overriden method to get the tuition
    @Override
    public double getTuition()
    {
        return tuition;
    }
    //overrriden to string method
    @Override
    public String toString()
    {
        return String.format("Undergraduate Student: Last name %s phone number %d tuition %.2f ",super.getName(), super.getPhone(), tuition);
    }
    
}
