package ps6.polygonProject;

//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing a class almost from scratch
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.
//

import java.util.ArrayList;
import java.awt.Point;
import predefined.Line;
public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
	private ArrayList<Point> points;
	
	public Polygon()
	{
		points = new ArrayList<Point>();
	}
	
	public void add(Point point)
	{
		points.add(point);
	}
	
	public double perimeter()
	{
		double perimeter = 0;
		if (points.size() > 2)
		{
			perimeter = points.get(0).distance(points.get(points.size() - 1));
		}
		for (int i = 1; i < points.size(); i ++)
		{
			perimeter = perimeter + points.get(i - 1).distance(points.get(i));
		}
		return perimeter;
	}
	
	public void draw()
	{
		Line line = new Line(points.get(0).getX(), points.get(0).getY(), points.get(points.size() - 1).getX(), points.get(points.size() - 1).getY());
		line.draw();
		for (int i = 1; i < points.size(); i ++)
		{
			new Line(points.get(i - 1).getX(), points.get(i - 1).getY(), points.get(i).getX(), points.get(i).getY()).draw();
		}
	}
}