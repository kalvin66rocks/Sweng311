/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodimensionalshapetest;

/**
 *
 * @author Kevin Brenneman
 */
public class Square extends TwoDimensionalShape {
    
    
    public Square( double length)
    {
        super(length, length);
    }
    
    @Override
    public double getArea()
    {
        
        setArea(getWidth()* getLength());
        return super.getArea();
        
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %.2f %s%.2f %n%s%.2f","The length of the square is:", getLength(), 
                " and the width is: ",getWidth(), "The area of a square is: ", getArea());
    }
    
}
