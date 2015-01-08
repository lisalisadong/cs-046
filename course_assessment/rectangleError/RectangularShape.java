package rectangleError;

import predefined.Rectangle;

// The squareTester method in this RectangularShape class 
// is supposed to take a Rectangle parameter and return a string.
//
// It returns "It is a square" if the rectangle is a square
// (meaning the width and height are equal).
// Otherwise, it returns "It is not a square"/
// However, this method has one runtime (logic) error and
// several compile-time errors.
//
// Your job is to find and correct the errors so that
// the method works correctly.
//
// Please do not remove any lines of code or change anything that is not an error.
// Submit the correctly functioning class.
//
// There is a tester to help you check your work.
//

/**
 * Class to practice finding errors
 * @author (your name)
 */
public class RectangularShape
{
   public String squareTester(Rectangle box)
   {
      int width = box.getWidth();
      int height = box.getHeight();
      String message = "";
      if (width == height)
      {
          message = "It is a square";
      }
      else
      {
          message = "It is not a square";
      }
      return message;
   }
}