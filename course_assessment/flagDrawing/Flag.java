package flagDrawing;

import predefined.Color;
import predefined.Picture;

// Here is the flag of Gabon. It has three equal horizontal lines of green, yellow,
// and blue. You are provided with the familiar Flag class. You are to complete the getColorAt
// method to return the correct color of each x,y so that the flag is drawn correctly
//
// See the image at this URL:
// http://i.imgur.com/FMaRlE8.png
//   
// You must use the else if construction
//

public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    public Flag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }

    public Color getColorAt(int x, int y)
    {
        // TODO: add correct conditions to determine which color needs to be used at any
        // (x, y) coordinate in order to produce the Gabon flag
        // TODO: set the variable c to that color
        // TODO: use else if
    	if (y < height / 3)
    	{
    		return Color.GREEN;
    	}
    	else if (y < 2 * height / 3)
    	{
    		return Color.YELLOW;
    	}
    	else
    	{
    		return Color.BLUE;
    	}
    }
}