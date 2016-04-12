/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author kkevin Brenneman
 */
public class tank {
    
    //final double capacity = 1000;
    public static double water_remaining = 1000;

//function to retrieve the remaining balance in the tank    
public double Check()
    {
        return water_remaining;
    }
    //method to set the last name

//used to retrieve water from the tank and to ensure the suer is not over using water for the selected use
public void Retrieve(int use, double amount)
    {
        if (use ==1)
        {
            if(amount <= water_remaining*.3)
            {
                water_remaining = water_remaining - amount;
            }
            else 
            {
                System.out.printf( "Not that much water available for flowering, only %.2f gallons available for flowering%n", (water_remaining * .3));
            }
        }
        if (use==2)
        {
            if(amount <= water_remaining*.5)
            {
                water_remaining = water_remaining - amount;
            }
            else
            {
                System.out.printf( "Not that much water available for drinking, only %.2f gallons available for drinking%n", (water_remaining * .15));
            }
        }
        if (use==3)
        {
            if(amount <= water_remaining*.55)
            {
                water_remaining = water_remaining - amount;
            }
            else 
            {
                System.out.printf( "Not that much water available for showering, only %.2f gallons available for showering%n", (water_remaining * .55));
            }
        }
        // default case in case invalid input is used
        else if ( use !=1 && use != 2 && use != 3)
        {
            System.out.println("That is a not a valid use.");
            System.out.println("No water retrieved.");
        }
            
    }
    
}
