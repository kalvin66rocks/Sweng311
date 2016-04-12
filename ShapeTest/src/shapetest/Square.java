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
public class Square extends TwoDimensionalShape {
    
    public Square(int x, int y, double side)
    {
        super(x,y,side,side);
    }
    
    @Override
    public double area()
    {
        return (super.getDimension1()*super.getDimension2());
    }
    
    public void setSide(double side)
    {
        super.setDimension1(side);
        super.setDimension2(side);
    }
    
    public double getSide()
    {
        return super.getDimension1();
    }
    
    @Override
    public String getName()
    {
        return "Square";
    }
}
