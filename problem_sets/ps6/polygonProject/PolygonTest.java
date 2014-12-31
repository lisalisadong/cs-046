package ps6.polygonProject;

import java.awt.Point;

public class PolygonTest
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       System.out.println(shape.perimeter());
       System.out.println("Expected: 0");
       
       shape.add(new Point(0, 0));
       shape.add(new Point(30, 40));
       System.out.println(shape.perimeter());
       System.out.println("Expected: 50");
       
       shape.add(new Point(20, 70));
       shape.draw();
    }
}