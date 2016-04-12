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
public class TwoDimensionalShape {
    private double length;
    private double width;
    private double area;
    
    public TwoDimensionalShape(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    //method to get the first name
    public double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    //method to get the first name
    public double getWidth()
    {
        return width;
    }
    public void setArea(double area)
    {
        this.area = area;
    }
    //method to get the first name
    public double getArea()
    {
        return area;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s", "placeholder");
    }

    
}
