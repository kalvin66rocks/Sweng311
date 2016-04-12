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
public class Sphere extends ThreeDimensionalShape {
    
    //constructor for the sphere
    public Sphere(int x, int y, double radius)
    {
        //calls the constructor for three dimensional shape
        super(x,y,radius,radius,radius);
    }
    
    //returns the surface area of the sphere
    @Override
    public double area()
    {
        return (4.0 * getRadius()*getRadius()* Math.PI);
    }
    
    //sets the radius of the sphere
    public void setRadius(double radius)
    {
        super.setDimension1(radius);
        super.setDimension2(radius);
        super.setDimension3(radius);
    }
    
    //gets the radius of the sphere
    public double getRadius()
    {
        return super.getDimension1();
    }
    
    //returns the name of the shape, in this case sphere
    @Override
    public String getName()
    {
        return "Sphere";
    }
    
    //returns the volume of the sphere
    @Override
    public double volume()
    {
        return  4.0 / 3.0 * getRadius() * getRadius()* getRadius() * Math.PI;
    }
    
}
