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
 * @author kalvi_000
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    private static Formatter output;
    private Vector<String> combinations = new Vector<>(1, 1);

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        int phone_number = 0;

        while (!valid) {
            System.out.printf("Enter a phone number (digits greater than 1 only): ");
            try {
                phone_number = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("That is not a number, please enter a valid number");
                valid = false;
            }
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
            if (valid) {
                if (phone_number < 1000000|| phone_number > 10000000) {
                    System.out.println("You must enter a 7 digit number");
                    valid = false;
                }
            }
        }

        openFile();
        writeFile(phone_number);
        closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("output.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write access denied. Terminating");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }
    public static void closeFile(){
        output.close();
    }

    public static void writeFile(int number) {
        int run = 0;
        int run1 =0;
        String temp = "";
        int power = 100000;
        while (run < 3) {
            try {
                switch ((number / 1000000)) {
                    case 2:
                        switch (run) {
                            case 0:
                                temp = temp.concat("A");
                                break;
                            case 1:
                                temp = temp.concat("B");
                                break;
                            case 2:
                                temp = temp.concat("C");
                                break;
                        }
                        break;
                    case 3:
                        switch (run) {
                            case 0:
                                temp = temp.concat("D");
                                break;
                            case 1:
                                temp = temp.concat("E");
                                break;
                            case 2:
                                temp = temp.concat("F");
                                break;
                        }
                        break;
                    case 4:
                        switch (run) {
                            case 0:
                                temp = temp.concat("G");
                                break;
                            case 1:
                                temp = temp.concat("H");
                                break;
                            case 2:
                                temp = temp.concat("I");
                                break;
                        }
                        break;
                    case 5:
                        switch (run) {
                            case 0:
                                temp = temp.concat("J");
                                break;
                            case 1:
                                temp = temp.concat("K");
                                break;
                            case 2:
                                temp = temp.concat("L");
                                break;
                        }
                        break;
                    case 6:
                        switch (run) {
                            case 0:
                                temp = temp.concat("M");
                                break;
                            case 1:
                                temp = temp.concat("N");
                                break;
                            case 2:
                                temp = temp.concat("O");
                                break;
                        }
                        break;
                    case 7:
                        switch (run) {
                            case 0:
                                temp = temp.concat("P");
                                break;
                            case 1:
                                temp = temp.concat("R");
                                break;
                            case 2:
                                temp = temp.concat("S");
                                break;
                        }
                        break;
                    case 8:
                        switch (run) {
                            case 0:
                                temp = temp.concat("T");
                                break;
                            case 1:
                                temp = temp.concat("U");
                                break;
                            case 2:
                                temp = temp.concat("V");
                                break;
                        }
                        break;
                    case 9:
                        switch (run) {
                            case 0:
                                temp = temp.concat("W");
                                break;
                            case 1:
                                temp = temp.concat("X");
                                break;
                            case 2:
                                temp = temp.concat("Y");
                                break;
                        }
                        break;
                }
                switch (((number%1000000) / 100000)) {
                    case 2:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("A");
                                break;
                            case 1:
                                temp = temp.concat("B");
                                break;
                            case 2:
                                temp = temp.concat("C");
                                break;
                        }
                        break;
                    case 3:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("D");
                                break;
                            case 1:
                                temp = temp.concat("E");
                                break;
                            case 2:
                                temp = temp.concat("F");
                                break;
                        }
                        break;
                    case 4:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("G");
                                break;
                            case 1:
                                temp = temp.concat("H");
                                break;
                            case 2:
                                temp = temp.concat("I");
                                break;
                        }
                        break;
                    case 5:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("J");
                                break;
                            case 1:
                                temp = temp.concat("K");
                                break;
                            case 2:
                                temp = temp.concat("L");
                                break;
                        }
                        break;
                    case 6:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("M");
                                break;
                            case 1:
                                temp = temp.concat("N");
                                break;
                            case 2:
                                temp = temp.concat("O");
                                break;
                        }
                        break;
                    case 7:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("P");
                                break;
                            case 1:
                                temp = temp.concat("R");
                                break;
                            case 2:
                                temp = temp.concat("S");
                                break;
                        }
                        break;
                    case 8:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("T");
                                break;
                            case 1:
                                temp = temp.concat("U");
                                break;
                            case 2:
                                temp = temp.concat("V");
                                break;
                        }
                        break;
                    case 9:
                        switch (run1) {
                            case 0:
                                temp = temp.concat("W");
                                break;
                            case 1:
                                temp = temp.concat("X");
                                break;
                            case 2:
                                temp = temp.concat("Y");
                                break;
                        }
                        break;
                }
                    run1 ++;
                    if(run1 ==3){
                        run1 = 0;
                        run ++;
                    }
                output.format("%s%n", temp);
                temp = "";
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                System.exit(1);
            }

        }

    }
}
