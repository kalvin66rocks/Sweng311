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
public class TwoDimensionalShape extends Shape{
    private double dimension1;
    private double dimension2;
    
    //default constructor for two dimensional shape, sets the dimensions
    public TwoDimensionalShape(int x, int y, double dimension1, double dimension2)
    {
        super(x,y);
        this.dimension1= dimension1;
        this.dimension2 = dimension2;
    }
    
    //sets dimension 1
    public void setDimension1(double dimension1)
    {
        this.dimension1 = dimension1;  
    }
    
    //sets dimensio2 3
    public void setDimension2(double dimension2)
    {
        this.dimension2 = dimension2;  
    }
    
    //returns dimension 1
    public double getDimension1()
    {
        return dimension1;
    }
    
    //returns dimension 2
    public double getDimension2()
    {
        return dimension2;
    }
    
    //returns the area of the shape
    public double area()
    {
        return dimension1*dimension2;
    }
}
