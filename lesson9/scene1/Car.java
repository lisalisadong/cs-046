package scene1;

import predefined.Rectangle;
import predefined.Ellipse;
import predefined.Line;

/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car
{
    private int xLeft;
    private int yTop;

    /**
       Constructs a car with a given top left corner.
       @param x the x coordinate of the top left corner
       @param y the y coordinate of the top left corner
    */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
       Draws this car.
    */
    public void draw()
    {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse frontTire = new Ellipse(xLeft + 10, yTop + 20, 10, 10);
        Ellipse rearTire = new Ellipse(xLeft + 40, yTop + 20, 10, 10);

        Line frontWindshield = new Line(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        Line roofTop = new Line(xLeft + 20, yTop, xLeft + 40, yTop);
        Line rearWindshield = new Line(xLeft + 40, yTop, xLeft + 50, yTop + 10);

        body.draw();
        frontTire.fill();
        rearTire.fill();
        frontWindshield.draw();
        roofTop.draw();
        rearWindshield.draw();
    }
}