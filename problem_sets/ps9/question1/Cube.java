package ps9.question1;

// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    // other methods
    public double getSurfaceArea()
    {
    	return side * side * 6;
    }
    
    public double getVolume()
    {
    	return side * side * side;
    }
}