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
public class Triangle extends TwoDimensionalShape {
    
    private double area;
    
    public Triangle( double length, double width)
    {
        super(length, width);
    }
    
    @Override
    public double getArea()
    {
        
        setArea(getWidth()* getLength()*.5);
        return super.getArea();
        
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %.2f %s%.2f %n%s%.2f","The height of the triangle is:", getLength(), 
                " and the width is: ",getWidth(), "The area of a triangle is: ", getArea());
    }
    
}
