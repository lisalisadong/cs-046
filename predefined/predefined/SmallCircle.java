package predefined;

/**
 * Describes a small circle that can be drawn
 */
public class SmallCircle
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class SmallCircle
     * @param xCoord the x coordinate of this Circle
     * @param yCoord the y coordinate of this Circle
     */
    public SmallCircle(int xCoord, int yCoord)
    {
        x = xCoord;
        y = yCoord;
    }

    /**
     * Fills the Circle
     */
    public void fill()
    {
        Ellipse circle = new Ellipse(x, y, 10, 10);
        circle.fill();
    }
}
