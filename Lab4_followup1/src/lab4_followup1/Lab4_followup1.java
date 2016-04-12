/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_followup1;

import java.util.Scanner;

/**
 *
 * @author Kevin Brenneman
 */
public class Lab4_followup1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int account_number = -2;
    int balance = -2;
    int charges = -2;
    int credits = -2;
    int credit_limit = -2;
    int counts = 0;
    
    Scanner input = new Scanner(System.in);
    //get input before we enter the while loop
    
    
    
    
    while(counts<3)
    {
        System.out.print("Enter account number: ");
        account_number = input.nextInt();
        //make sure we are using a valid account number 
        if(account_number > 0)
        {
            //get and validate the balance
            while(balance < 0)
            {
                System.out.print("Enter Balance: ");
                balance = input.nextInt();
            }
            
            //get and validate the charges
            while( charges < 0)
            {
                System.out.print("Enter Charges: ");
                charges = input.nextInt();
            }
            
            //get and validate the credits
            while( credits < 0)
            {
                System.out.print("Enter Credits: ");
                credits = input.nextInt();
            }
            
            //get and validate the credit limit
            while( credit_limit < 0)
            {
                System.out.print("Enter Credit Limit: ");
                credit_limit = input.nextInt();
            }
            //increases the count so that we only get infor for 3 accounts
            counts++;
            
            //calculates the new balance
            balance = balance + charges - credits;
            
            //prints the new balance
            System.out.printf("The new balance is %d%n", balance);
            
            //checks if the credit limit has been exceeded
            if( balance > credit_limit)
            {
                System.out.println("Credit limit exceeded");
            }
            
            //prints a new line
            System.out.println("");
            
            //resets all the variables so that we are able to validate input
            account_number = -2;           
            balance = -2;
            charges = -2;
            credits = -2;
            credit_limit = -2;
            
        }
      }
    }
    
}
