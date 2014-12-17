package charlieFlag;

import predefined.Color;
import predefined.Picture;

// Bluej project: charlieFlag
public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    public Color getColorAt(int x, int y)
    {
        // TODO: write code to determine if the pixel at x, y should be blue, red or white.
        // You need to use || boolean operator in your solution
    	Color c;
    	if (y < height / 5 || y >= height * 4 / 5)
    	{
    		c = Color.BLUE;
    	}
    	else if ( y >= height * 2 / 5 && y < height * 3 / 5)
    	{
    		c = Color.RED;
    	}
    	else
    	{
    		c = Color.WHITE;
    	}
    	return c;
    }

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
}