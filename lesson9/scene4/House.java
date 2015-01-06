package scene4;
import predefined.Rectangle;
import predefined.Line;

//HIDE
/**
   This class draws a house of a given size.
*/
public class House implements Drawable
{
    private int xleft;
    private int ytop;
    private int ybottom;
    private int width;
    private int height;

    /**
       Constructs a house with given location and size.
       @param x the left corner coordinate
       @param y the top corner coordinate
       @param width the width
       @param height the height
    */
    public House(int x, int y, int width, int height)
    {
        xleft = x;
        ytop = y;
        ybottom = y + height;
        this.width = width;
        this.height = height;
    }

    /**
       Draws this house.
    */
    public void draw()
    {
        Rectangle front =
            new Rectangle(xleft, ytop + height * 1 / 5, width, height * 4 / 5);

        Rectangle door =
            new Rectangle(xleft + width / 5, ytop + height / 2, width / 5, height / 2);

        Rectangle window =
            new Rectangle(xleft + width * 3 / 5, ytop + height / 2, width / 5, height / 5);

        Line roofLeft =
            new Line(xleft, ytop + height * 1 / 5, xleft + width / 2, ytop);

        Line roofRight =
            new Line(xleft + width, ytop + height * 1 / 5, xleft + width / 2, ytop);

        front.draw();
        door.draw();
        window.draw();
        roofLeft.draw();
        roofRight.draw();
    }
}