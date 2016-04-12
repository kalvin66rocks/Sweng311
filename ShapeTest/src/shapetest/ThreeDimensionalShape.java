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
public class ThreeDimensionalShape extends Shape{
    private double dimension1;
    private double dimension2;
    private double dimension3;
    
    //constructor for the three dimensional shape, sets each of the dimensions
    public ThreeDimensionalShape(int x, int y, double dimension1, double dimension2 , double dimension3)
    {
        super(x,y);
        this.dimension1= dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
    }
    
    //sets dimension 1
    public void setDimension1(double dimension1)
    {
        this.dimension1 = dimension1;  
    }
    
    //sets dimension 2
    public void setDimension2(double dimension2)
    {
        this.dimension2 = dimension2;  
    }
    
    //sets dimension 3
    public void setDimension3(double dimension3)
    {
        this.dimension3 = dimension3;  
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
    
    //returns dimension 3
    public double getDimension3()
    {
        return dimension3;
    }
    
    //returns the surface area of the shape
    public double area()
    {
        return dimension1*dimension2;
    }
    
    //returns the volume of the shape
    public double volume()
    {
        return dimension1*dimension2*dimension3;
    }
    
}
