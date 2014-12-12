package ps2.squareConstructor;

//
// You are to write the constructor specified for this Square class. The Square class 
// has a double instance variable, side, which is the length of each side of the square
// The javadoc has been provided for you to help you tell what you need to do
//     
// HINT: Write the constructor for the class Square.
// The constructor will take in a parameter of the type double
// and assign that parameter to the instance variable side
//
    
    
public class Square
{
    private double side;

    /**
     * Constructor for objects of class Square
     * @param theSide the length of the side of this Square
     */


      // your code goes below:
    public Square (double side)
    {
    	this.side = side;
    }     

    
      /**
       * Gets the length of a side of this square
       * @return the side of this square
       */
      public double getSide()
      {
          return side;
      }
}
