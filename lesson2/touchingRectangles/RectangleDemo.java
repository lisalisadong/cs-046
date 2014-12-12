package touchingRectangles;

import predefined.Rectangle;

// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        // TODO: Construct and draw the rectangles
    	Rectangle a = new Rectangle(60, 90, 20, 30);
    	Rectangle b = new Rectangle(80, 120, 20, 30);
    	a.draw();
    	b.draw();
    }
}
