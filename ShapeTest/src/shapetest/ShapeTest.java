// Lab 8 : ShapeTest.java
// Program tests the Shape hierarchy.

package shapetest;

public class ShapeTest
{
   private Shape shapeArray[];

   // create shapes
   public ShapeTest()
   {
      shapeArray = new Shape[ 4 ];

      shapeArray[ 0 ] = new Circle( 22, 88, 1.25 );
      shapeArray[ 1 ] = new Square( 71, 96, 2.5 );
      shapeArray[ 2 ] = new Sphere( 8, 89, 3.75 );
      shapeArray[ 3 ] = new Cube( 79, 61, 5.0 );
   } // end ShapeTest constructor

   // display shape info
   public void displayShapeInfo()
   {
      // call method toString on all shapes
      for ( int i = 0; i < shapeArray.length; i++ )
      {
         System.out.printf( "%s: %s\n", shapeArray[ i ].getName(), shapeArray[ i ] );

         if ( shapeArray[ i ] instanceof TwoDimensionalShape )
         {
            TwoDimensionalShape current = ( TwoDimensionalShape ) shapeArray[ i ];
            System.out.printf( "%s's area is %.2f\n", current.getName(), 
               current.area() );
         } // end if

         if ( shapeArray[ i ] instanceof ThreeDimensionalShape )
         {
            ThreeDimensionalShape current = ( ThreeDimensionalShape ) shapeArray[ i ];

            System.out.printf( "%s's area is %.2f\n%s's volume is %.2f\n", 
               current.getName(), current.area(), current.getName(), 
               current.volume() );
         } // end if
      } // end for
   } // end method displayShapeInfo

   // create ShapeTest object and display info
   public static void main( String args[] )
   {
      ShapeTest driver = new ShapeTest();
      driver.displayShapeInfo();
   } // end main
}  // end class ShapeTest

