package loopWithCircles;

import predefined.Ellipse;

// The CirclePyramid class represents a pyramid of circles.

// See the image at this link for a picture of one pyramid:
// http://i.imgur.com/0NH6vwW.png
//   
// In the above example the upper left-hand corner
// of the pyramid is at (310, 0)
//
// CirclePyramid has a constructor which is provided for you.
// The constructor takes the x and y coordinates of the upper-left hand corner of the
// pyramid, the number of rows in the pyramid and the diameter of each circle
//
// CirclePyramid has a draw method which will draw the pyramid. That method is started
// for you. Your task is to finish the code of the draw method.
//
// You must use nested loops to draw the rows of circles as shown in the picture.
// There is 1 circle in the first row, 2 circles in the second row, and so on.
// You must use the constants provided for the number of rows and the diameter.
//
// Start the first circle at (startX, startY). That means the upper left-hand corner of the 
// rectangle that surrounds the circle is at (startX, startY).
//
// If a circle's upper left-hand corner is at (x, y), then the circle to the right has
// coordinates of (x + DIAMETER, y) and the circle below it has coordinates of
// (x, y + DIAMETER).
//
// Do not add any space between the circles. That will just happen as you draw in the
// correct locations.
//
// To create a circle, create an ellipse where the width and height are equal.
// To create a circle where the upper left-hand corner of the surrounding rectange
// is at (x, y) and the diameter of the circle is DIAMETER, do this:
//
// Ellipse circle = new Ellipse( x, y, DIAMETER, DIAMETER);
//
// Be sure to fill the circles, not draw them.
//
// The viewer provided instantiates and draws two pyramids.
// Here is an image that will be produced:
// http://i.imgur.com/CSXPW7a.png   
//
public class CirclePyramid
{
    // instance variables - replace the example code below with your own
    private final int ROWS;
    private final int DIAMETER;
    private int startX;
    private int startY;

    /**
     * Constructor for objects of class CirclePyramid
     * @param startX the x coordinate of the upper left-hand corner of the pyramid
     * @param startY the y coordinate of the upper left-hand corner of the pyramid
     * @param rows the number of rows in the pyramid
     * @param diameter the diameter of the circles
     */
    public CirclePyramid(int x, int y, int rows, int diameter)
    {
        ROWS = rows;
        DIAMETER = diameter;
        startX = x;
        startY = y;

    }

    public void draw()
    {
        int x = startX;
        int y = startY;
        
        // Add code here to finish the draw() method.
        for (int i = 0; i < ROWS; i++)
        {
        	x = startX;
        	for (int j = 1; j <= i + 1; j++)
        	{
        		new Ellipse(x, y, DIAMETER, DIAMETER).fill();
        		x = x + DIAMETER;
        	}
        	y = y + DIAMETER;
        }
    }
}