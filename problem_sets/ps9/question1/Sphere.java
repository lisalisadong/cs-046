package ps9.question1;

// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Sphere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Shpere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    //other methods
    public double getSurfaceArea()
    {
    	return Math.PI * radius * radius * 4;
    }
    
    public double getVolume()
    {
    	return Math.PI * radius * radius * radius * 4 / 3;
    }
}