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
public class Circle extends TwoDimensionalShape {
    
    public Circle(double radius)
    {
        super(radius, radius);
    }
    
    @Override
    public double getArea()
    {
        
        setArea(getWidth()* getLength() * Math.PI);
        return super.getArea();
        
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %.2f %n%s%.2f","The radius of the circle is:", getWidth(), 
                "The area of a circle is: ",getArea());
    }
    
    
}
