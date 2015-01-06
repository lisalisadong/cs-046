package ps8.robot;

// Implement a class Robot that simulates a robot wandering randomly on an infinite plane. The robot
// is located at a point with integer coordinates. It initially faces "North" - the top of the window.

//Supply a constructor that specifies the initial x, y coordinates of the robot as ints.

//Supply methods:
//public void makeRandomMove()
//public Point getLocation()
//public double getDistanceFromStart()

//The makeRandomMove method moves the robot by one unit in a random direction.
// To choose the random direction, generate an int from 0 to 3. 
//  0 is toward the top of the window (north)
//  1 is towards the bottom of the window (south)
//  2 is towards the right side of the window (east)
//  3 is towards the left side of the window (west)

// getLocation() returns a java.awt.Point containing the current x and y location of the Robot

// getDistanceFromStart() returns the distance the robot is from the starting point.

// This problem is an example of describing the design pattern, position of an objet.

//You would expect that if the robot is moving randomly that he would wind up very close to where he started,
//but that is not true. It would take more of a mathematician than I am to explain why. But it is interesting.
//You can comment out the generator.setSeed(...) statement and see lots of different outcomes. But do not
//forget to put the statement back in. When you "seed" a random number generator with a starting value,
//it will give the same sequence of values every time. That is what makes it possible to test your
//programs. If we both start with the same seed in the random number generator, we should get the same
//answes.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 8 - Question 3" for some tips on 
// how to begin.
/**
 * Simulates a robot wandering randomly on an infinite plane
 *
 */
import java.awt.Point;
import java.util.Random;

public class Robot
{
    // TODO: define other instance variables
    private Random generator;
	private Point original;
	private Point current;

    /**
     * Constructor for objects of class Robot
     * @param theX the x coordinate
     * @param theY the y coordinate
     */
    public Robot(int theX, int theY)
    {
        // TODO: Complete the constructor
        generator = new Random();
        generator.setSeed(12345);  //do not change this statement
        original = new Point(theX, theY);
        current = new Point(theX, theY);
        System.out.println(original);
        System.out.println(current); 
    }

    // TODO Supply getLocation
    public Point getLocation()
    {
        return current;
    }
    
    // TODO: Supply the methods of the Robot class
    public void makeRandomMove()
    {
    	int direction = generator.nextInt(4);
    	if (direction == 0)
    	{
    		current.translate(0, -1);
    	}
    	else if (direction == 1)
    	{
    		current.translate(0, 1);
    	}
    	else if (direction == 2)
    	{
    		current.translate(1, 0);
    	}
    	else
    	{
    		current.translate(-1, 0);
    	}
    }
    
    public double getDistanceFromStart()
    {
    	return current.distance(original);
    }
}