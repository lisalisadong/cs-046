package scene4;
import predefined.Rectangle;
import predefined.Ellipse;
import predefined.Line;

//HIDE
/**
A car shape that can be positioned anywhere on the screen.
*/
public class Car implements Drawable, Moveable
{
    private Rectangle body;
    private Ellipse frontTire;
    private Ellipse rearTire;

    private Line frontWindshield;
    private Line roofTop;
    private Line rearWindshield;

    /**
    Constructs a car with a given top left corner.
    @param xLeft the x coordinate of the top left corner
    @param yTop the y coordinate of the top left corner
    */
    public Car(int xLeft, int yTop)
    {
        body = new Rectangle(xLeft, yTop + 10, 60, 10);
        frontTire = new Ellipse(xLeft + 10, yTop + 20, 10, 10);
        rearTire = new Ellipse(xLeft + 40, yTop + 20, 10, 10);

        frontWindshield = new Line(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        roofTop = new Line(xLeft + 20, yTop, xLeft + 40, yTop);
        rearWindshield = new Line(xLeft + 40, yTop, xLeft + 50, yTop + 10);

    }

    public void move(int seconds)
    {
        final int SPEED = 10; // pixels per second
        body.translate(seconds * SPEED, 0);
        frontTire.translate(seconds * SPEED, 0);
        rearTire.translate(seconds * SPEED, 0);
        frontWindshield.translate(seconds * SPEED, 0);
        roofTop.translate(seconds * SPEED, 0);
        rearWindshield.translate(seconds * SPEED, 0);
    }

    /**
       Draws this car.
    */
    public void draw()
    {
        body.draw();
        frontTire.fill();
        rearTire.fill();
        frontWindshield.draw();
        roofTop.draw();
        rearWindshield.draw();
    }
}