/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagetest;

/**
 *
 * @author Kevin Brenneman
 */
public class Garage {
    
    //class variable to store the running charges in
    private static double running_charges = 0.0;
    
    //calculates the charges and returns them to the user
    public double calculateCharges(double hours)
    {
        double ceiling_hours=0.0;
        double charges=0.0;
        //uses the celing function so that we don't have to worry about accounting for partial hours
        ceiling_hours = Math.ceil(hours);
        //charges if they are there 2 hours or less
        if(ceiling_hours < 3)
        {
            charges = 12.00;
        }
        //charges if they are there for any more than 2 hours
        if (ceiling_hours > 2)
        {
            charges = 12.00 + ((ceiling_hours-2)*5.00);
        }
        //correction since the maximum charge per day is 60.00
        if (charges > 60)
        {
            charges = 60.00;
        }
        //adds the current charges to the charges so far
        running_charges += charges;
        //returns the charges to the user
        return charges;
    }
    
    //returns the total charges to the user
    public double get_total()
    {
        return running_charges;
    }
    
}
