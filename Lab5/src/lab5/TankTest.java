/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author Kevin Brenneman
 */
public class TankTest {
    
    public static void main(String[] args) {
        // create new tank objects john and mary
        tank John = new tank();
        tank Mary = new tank();
        //declare variables
        int use;
        double amount;
        int select = 0;
        
        //create a new scanner input
        Scanner input = new Scanner(System.in);
        
        //always loop
        while(select != -1)
        {
        //uses an int to select who is going to be using the water
        System.out.println("Who is using the water, John(1) or Mary(2)?");
        select = input.nextInt();
        // uses a switch statement to select user
        switch(select)
        {
            // john is using the water
            case 1:
                System.out.println("What would John like to retrieve water for?");
                System.out.printf("1 for Flowering%n2 for Drinking %n3 for Showering %n");
                use = input.nextInt();
                System.out.printf("How much water would John like to retrieve?%n");
                amount = input.nextDouble();
                John.Retrieve(use, amount);
                System.out.printf("There are %.2f gallons reamining in the tank %n", John.Check());
                break;
            // mary is using the water
            case 2:
                System.out.println("What would Mary like to retrieve water for?");
                System.out.printf("1 for Flowering%n2 for Drinking %n3 for Showering %n");
                use = input.nextInt();
                System.out.printf("How much water would Mary like to retrieve?%n");
                amount = input.nextDouble();
                Mary.Retrieve(use, amount);
                System.out.printf("There are %.2f gallons reamining in the tank %n", Mary.Check());
                break;
            default://invalid input or user is going to quit
                break;
            
        }
        }
        
    }
    
}
