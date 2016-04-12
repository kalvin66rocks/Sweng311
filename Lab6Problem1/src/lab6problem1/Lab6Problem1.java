/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6problem1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Brenneman
 */
public class Lab6Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean isValid = false;
        boolean isValid1 = false;
        double temperature = 0;
        String unit = null;
        while (isValid1 == false) {
            isValid1 = false;
            //obtain the unit of input frpom the user
            unit = JOptionPane.showInputDialog("Enter the unit of temperate, (f)ahrenheit or (c)elsius");
            //input validation
            if (unit.toLowerCase().equals("f") || unit.toLowerCase().equals("c")) {
                isValid1 = true;
            }
        }

        while (isValid == false) {
            isValid = true;
            //obtain user input of temperature using JOptionPane input Dialog
            String fahrenheit_string = JOptionPane.showInputDialog("Enter a temperature in degrees " + unit);
            //exception handling for conversion
            try {
                temperature = Double.parseDouble(fahrenheit_string);
            } catch (NumberFormatException e) {
                isValid = false;
            }
        }

        //if we need to convert to celsius
        if (unit.toLowerCase().equals("f")) {
            //conversion to celsius
            double converted = (5.0 / 9.0) * (temperature - 32);
            JOptionPane.showMessageDialog(null, "The temperature in degrees celsius is " + converted);
        }

        //if we need convert to fahrenheit
        if (unit.toLowerCase().equals("c")) {
            //conversion to fahrenheit
            double converted = 32 + (temperature * 1.8);
            JOptionPane.showMessageDialog(null, "The temperature in degrees fahrenheit is " + converted);
        }

    }

}
