package elSolid;

// On the planet Vegas, a storage vessel has an unusual shape. It is el shaped and
// called an el-solid. Look at the image at this link.
// http://i.imgur.com/luiAm6O.png
//   
// The  yellow cube has a side of x
// The red retangle has dimensions of 2x, x, and x
// The volume is the shape is volume rectangle + volume cube
// (2x)(x)(x) + x^3 = 3x^3
// (Don't spend time trying to figure this out. Just use the formula.)
//
// Complete the El_Solid class.
// An El_Solid has a constructor that takes the height of the cube (x in the diagram) as a
// parameter.
// It has a method volume that returns the volume of this el-solid.
// It has a method increaseX that increases the value of x by a given amount - The shape always maintains
// the same proportions.
//
public class El_Solid
{
    // instance variables - replace the example below with your own
    private double x;

    /**
     * Constructor for objects of class El_Solid
     * @param side the side of the cube part of the shape
     */
    public El_Solid(double side)
    {
        x = side;
    }

    /**
     * Gets the volume of this el-shpae
     * @return the volume
     */
    public double volume()
    {
       // TODO: complete the method
    	return 3 * x * x * x;
    }

    /**
     * Increase the side of the cube part of the el-shape by the given delta
     * @delta the amount be which to increase the side (a double)
     */
    public void increaseX(double delta)
    {
       // TODO: complete the method
    	x = x + delta;
    }
}