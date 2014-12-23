package dim;

import predefined.Color;
import predefined.Picture;

// Bluej project: lesson6/dim

public class Dim
{
    public static void main(String[] args)
    {
        Picture mary = new Picture("./predefined/pic/queen-mary.png");
        mary.draw();
        // TODO iterate over the pixels in the image turning every 5th one to Color.BLACK
        // your code here.
        for (int i = 0; i < mary.pixels(); i = i + 5)
        {
        	mary.setColorAt(i, Color.BLACK);
        }
    }
}