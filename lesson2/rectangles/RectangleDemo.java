package rectangles;

import predefined.Rectangle;

public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 60, 90);
        box.draw();
        box.translate(200, 100);
    }
}
