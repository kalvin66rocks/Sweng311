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
public class TwoDimensionalShapeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare a new array of two dimensional shapes
        TwoDimensionalShape[] test = new TwoDimensionalShape[6];
        //fill our array of two dimensional shapes
        test[0] = new Square(5);
        test[1] = new Square(7);
        test[2] = new Circle(4);
        test[3] = new Circle(8);
        test[4] = new Triangle(4,4);
        test[5] = new Triangle(6,8);
        
        String[] names = new String[6];
        names[0] = "Square";
        names[1] = names[0];
        names[2] = "Circle";
        names[3] = names[2];
        names[4] = "Triangle";
        names[5] = names[4];
        
        for(int i= 0; i <6; i++)
        {
            System.out.printf("Using the getarea() method, the area of a %s is: %.2f%n",names[i],test[i].getArea());
            System.out.printf("Using the toString method for a %s: %n%s%n%n",names[i],test[i].toString());
        }
        
    }
    
}
