/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_problem2;

import javax.swing.JFrame;

/**
 *
 * @author Kevin Brenneman
 */
public class Lab11_problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new frame
        lab11_p2_jframe frame = new lab11_p2_jframe();
        //set the frame to exit on close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set the default size of the frame
        frame.setSize(400, 400);
        //make the fram visible
        frame.setVisible(true);
    }
    
}
