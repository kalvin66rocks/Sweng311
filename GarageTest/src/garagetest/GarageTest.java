/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagetest;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Kevin Brenneman
 */
public class GarageTest {

    public static void main(String[] args) {
        
        //initialize hours to a non negative value 
        double hours= 1.0;
        //initialize a varialbe to help us validate the input from the user
        boolean inputValid = false;
        //create a new garage object
        Garage garage = new Garage();
        //create a new scanner input
        Scanner input = new Scanner(System.in);
        
        while (hours >= 0) {
            //loop through this until the user enter a valid number
            while(!inputValid)
            {
                //gets the input from the user
                try {
                    System.out.printf("Enter the number of hours(or a negative to quit): ");
                    hours = input.nextDouble();
                    inputValid = true;    
                } 
                //catches an exceptions that we might get for a mismatch of input entered by the user
                catch (InputMismatchException e) {
                    System.out.println("Invalid Input");
                    input.nextLine();
                    inputValid = false;
                }
            }
            //only calculates new charges if the user entered a non negative number of hours
            if(hours>=0){
            System.out.printf("Current Charges: $%.2f, Total reciepts: $%.2f\n", garage.calculateCharges(hours), garage.get_total());
            }
            //cleare the variable we are using to determine valid user input
            if(inputValid = true)
                inputValid = false;
        }
    }
}
