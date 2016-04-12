/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Kevin Brenneman
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    private static Formatter output;
    private Vector<String> combinations = new Vector<>(1, 1);

    public static void main(String[] args) {
        //new scanner object
        Scanner input = new Scanner(System.in);
        //variable for user input
        boolean valid = false;
        int phone_number = 0;

        while (!valid) {
            System.out.printf("Enter a phone number (digits greater than 1 only): ");
            //get user input
            try {
                phone_number = input.nextInt();
                valid = true;
                //catch a mismatch exception
            } catch (InputMismatchException e) {
                System.err.println("That is not a number, please enter a valid number");
                valid = false;
            }
            //ensure that the number does not contain a 1 or a 0
            if (valid) {
                int temp = phone_number;
                while (temp != 0) {
                    if (temp % 10 == 0) {
                        System.out.println("You may not enter a 0 in the phone number");
                        temp = 0;
                        valid = false;
                    }
                    if (temp % 10 == 1) {
                        System.out.println("You may not enter a 1 in the phone number");
                        temp = 0;
                        valid = false;
                    }
                    temp = temp / 10;
                }
            }
            // makes sure the phone number is 7 digits
            if (valid) {
                if (phone_number < 1000000 || phone_number > 10000000) {
                    System.out.println("You must enter a 7 digit number");
                    valid = false;
                }
            }
        }

        //open the file
        openFile();
        //write the combinations of letters to the file
        writeFile(phone_number);
        //close the file
        closeFile();
    }

    //open the file
    public static void openFile() {
        //try to open the file
        try {
            output = new Formatter("output.txt");
            //catch if we cannot open the file
        } catch (SecurityException securityException) {
            System.err.println("Write access denied. Terminating");
            System.exit(1);
            //catch if the file does not exist
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }

    //close the file
    public static void closeFile() {
        output.close();
    }

    //write values to the file
    public static void writeFile(int number) {
        String temp = "";
        //try block for writing to the file
        try {
            //for loop for the first digit
            for (int i = 0; i < 3; i++) {
                temp = "";
                temp = temp.concat(letterSelect((number / 1000000), i));
                int num1 = number % 1000000;
                //for loop for the second digit
                for (int j = 0; j < 3; j++) {
                    temp = temp.substring(0, 1);
                    temp = temp.concat(letterSelect(num1 / 100000, j));
                    int num2 = number % 100000;
                    //for loop for the third digit
                    for (int k = 0; k < 3; k++) {
                        temp = temp.substring(0, 2);
                        temp = temp.concat(letterSelect(num2 / 10000, k));
                        int num3 = number % 10000;
                        //for loop for the fourth digit
                        for (int l = 0; l < 3; l++) {
                            temp = temp.substring(0, 3);
                            temp = temp.concat(letterSelect(num3 / 1000, l));
                            int num4 = number % 1000;
                            //for loop for the fifth digit
                            for (int m = 0; m < 3; m++) {
                                temp = temp.substring(0, 4);
                                temp = temp.concat(letterSelect(num4 / 100, m));
                                int num5 = number % 100;
                                //for loop for the sixth digit
                                for (int n = 0; n < 3; n++) {
                                    temp = temp.substring(0, 5);
                                    temp = temp.concat(letterSelect(num4 / 10, n));
                                    int num6 = number % 10;
                                    //for loop for the seventh digit
                                    for (int o = 0; o < 3; o++) {
                                        temp = temp.substring(0, 6);
                                        temp = temp.concat(letterSelect(num6, o));
                                        //write the string to the file
                                        output.format("%s%n", temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //catch if we get a weird error where we cannot write to the file
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
            System.exit(1);
        }
    }

    //determine what letter we are going to add to the string based off of what number and iteration we are on
    public static String letterSelect(int number, int run) {
        switch (number) {
            case 2:
                switch (run) {
                    case 0:
                        return ("A");
                    case 1:
                        return ("B");
                    case 2:
                        return ("C");
                }
                break;
            case 3:
                switch (run) {
                    case 0:
                        return ("D");
                    case 1:
                        return ("E");
                    case 2:
                        return ("F");
                }
                break;
            case 4:
                switch (run) {
                    case 0:
                        return ("G");
                    case 1:
                        return ("H");
                    case 2:
                        return ("I");
                }
                break;
            case 5:
                switch (run) {
                    case 0:
                        return ("J");
                    case 1:
                        return ("K");
                    case 2:
                        return ("L");
                }
                break;
            case 6:
                switch (run) {
                    case 0:
                        return ("M");
                    case 1:
                        return ("N");
                    case 2:
                        return ("O");
                }
                break;
            case 7:
                switch (run) {
                    case 0:
                        return ("P");
                    case 1:
                        return ("R");
                    case 2:
                        return ("S");
                }
                break;
            case 8:
                switch (run) {
                    case 0:
                        return ("T");
                    case 1:
                        return ("U");
                    case 2:
                        return ("V");
                }
                break;
            case 9:
                switch (run) {
                    case 0:
                        return ("W");
                    case 1:
                        return ("X");
                    case 2:
                        return ("Y");
                }
                break;
        }
        //we should never hit this, but java required a default return value
        return ("ERROR");
    }
}
