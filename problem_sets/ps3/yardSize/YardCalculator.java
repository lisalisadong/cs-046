package ps3.yardSize;

//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that takes 
//the width and length in feet as arguments
//public YardCalculator(double length, double width)

//Provide methods :

//public double perimeter() which returns the perimeter in meters
//public double area() which returns the area in square meters
//public double diagonal() which returns the diagonal in meters

//1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it.

//      public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin. 

public class YardCalculator
{
	
	private double l;
	private double w;
	public static final double METERS_PER_FOOT = 0.3048;
	
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
   public YardCalculator(double theLength, double theWidth)
   {
	   l = theLength;
	   w = theWidth;
   }   
   
   /**
    * Gets the perimeter of the yard
    * @return the perimeter
    */
   public double perimeter()
   {
	   return (2 * l + 2 * w) * METERS_PER_FOOT;
   }

   /**
    * Gets the area of the yard
    * @return the area
    */
   public double area()
   {
	   return l * w * Math.pow(METERS_PER_FOOT, 2);
   }

    /**
    * Gets the diagonal of the yard
    * @return the diagonal
    */
   public double diagonal()
   {
	   return Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2)) * METERS_PER_FOOT;
   }

}