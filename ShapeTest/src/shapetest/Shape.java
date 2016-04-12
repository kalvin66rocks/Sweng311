// Lab 8 : Shape.java
// Definition of class Shape.

package shapetest;

public class Shape
{
   private int x, y;    // coordinates of shape

   // constructor
   public Shape( int x, int y )
   {
      this.x = x;
      this.y = y;
   }

   // set x coordinate
   public void setX( int x )
   {
      this.x = x;
   }

   // set y coordinate
   public void setY( int y )
   {
      this.y = y;
   }

   // get x coordinate
   public int getX()
   {
      return x;
   }

   // get y coordinate
   public int getY()
   {
      return y;
   }

   public String getName()
	{
      return "Shape";
	}
   public String toString()
   {
      return "Shape";
   }
}  // end class Shape

