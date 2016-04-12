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
                if (phone_number < 1000000 || phone_number > 10000000) {
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

    public static void closeFile() {
        output.close();
    }

    public static void writeFile(int number) {
        int run = 0;
        int run1 = 0;
        String temp = "";
        //int power = 100000;
        try {
            for (int i = 0; i < 3; i++) {
                temp = "";
                temp = temp.concat(letterSelect((number / 1000000), i));
                int num1 = number % 1000000;
                for (int j = 0; j < 3; j++) {
                    temp = temp.substring(0, 1);
                    temp = temp.concat(letterSelect(num1 / 100000, j));
                    int num2 = number % 100000;
                    for (int k = 0; k < 3; k++) {
                        temp = temp.substring(0, 2);
                        temp = temp.concat(letterSelect(num2 / 10000, k));
                        int num3 = number % 10000;
                        for (int l = 0; l < 3; l++) {
                            temp = temp.substring(0, 3);
                            temp = temp.concat(letterSelect(num3 / 1000, l));
                            int num4 = number % 1000;
                            for (int m = 0; m < 3; m++) {
                                temp = temp.substring(0, 4);
                                temp = temp.concat(letterSelect(num4 / 100, m));
                                int num5 = number % 100;
                                for (int n = 0; n < 3; n++) {
                                    temp = temp.substring(0, 5);
                                    temp = temp.concat(letterSelect(num4 / 10, n));
                                    int num6 = number % 10;
                                    for (int o = 0; o < 3; o++) {
                                        temp = temp.substring(0, 6);
                                        temp = temp.concat(letterSelect(num6, o));
                                        output.format("%s%n", temp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file. Terminating.");
            System.exit(1);
        }
    }

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
        return ("ERROR");
    }
}
