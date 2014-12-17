package indonesianFlag;

import predefined.Color;
import predefined.Picture;

// Bluej project: lesson5/indonesianFlag

// Please use the >= operator
public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    public Color getColorAt(int x, int y)
    {
        // TODO: add correct conditions to determine which color needs to be used at any (x, y) coordinate
        // TODO: set the variable c to that color
        Color c;
        if (y >= height / 2)
        {
            c = Color.WHITE;
        }
        else
        {
            c = Color.RED;
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
