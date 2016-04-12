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
public class Cube extends ThreeDimensionalShape{
    
    //constructor for the cube
    public Cube(int x, int y, double side)
    {
        //calls the constructor for three dimensional shape
        super(x,y,side,side,side);
    }
    
    //returns the surface area for the cube
    @Override
    public double area()
    {
        return (getSide()*getSide()*6.0);
    }
    
    //sets the length of a side
    public void setSide(double side)
    {
        super.setDimension1(side);
        super.setDimension2(side);
        super.setDimension3(side);
    }
    
    //gets the length of a side
    public double getSide()
    {
        return super.getDimension1();
    }
    
    //returns the name of the shape, in this case cube
    @Override
    public String getName()
    {
        return "Cube";
    }
    
    //returns the area of the cube
    @Override
    public double volume()
    {
        return (getSide() * getSide() * getSide());
    }
    
}
