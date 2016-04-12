/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapetest;

/**
 *
 * @author Kevin Brenneman
 */
public class Circle extends TwoDimensionalShape {
    
    public Circle(int x, int y, double radius)
    {
        super(x,y,radius,radius);
    }
    
    @Override
    public double area()
    {
        return (super.getDimension1()*super.getDimension2()*Math.PI);
    }
    
    public void setRadius(double radius)
    {
        super.setDimension1(radius);
        super.setDimension2(radius);
    }
    
    public double getRadius()
    {
        return super.getDimension1();
    }
    
    @Override
    public String getName()
    {
        return "Circle";
    }
}
