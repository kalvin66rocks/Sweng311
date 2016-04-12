/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

import java.util.Vector;

/**
 *
 * @author Kevin Brenneman
 */
public class Room {
    private int number;
    Vector<Course> courses = new Vector<>(1,1);
    public Room(int room_number)
    {
        this.number = room_number;
    }
    
    public int get_number(){
        return number;
    }
    
    
}
