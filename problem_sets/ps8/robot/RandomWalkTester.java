package ps8.robot;

import java.awt.Point;
public class RandomWalkTester
{
    public static void main(String[] args)
    {   

        Robot robby = new Robot(100,100);
        move(robby, 1000000);

        System.out.printf("%s%.2f\n", "Distance: ",robby.getDistanceFromStart());
        System.out.println("Expected: 678.07");
        Point end = robby.getLocation();
        System.out.println("X: " + end.getX());
        System.out.println("Expected: 110.0");
        System.out.println( "Y: " + end.getY());
        System.out.println("Expected: -578.0");

        robby = new Robot(10, 10);
        move(robby, 500);
        end = robby.getLocation();
        System.out.println(end);
        System.out.println("Expected: java.awt.Point[x=21,y=1]");
        System.out.printf("%s%.2f\n", "Distance: ",robby.getDistanceFromStart());
        System.out.println("Expected: 14.21");
    }

    private static void move(Robot robby, int moves)
    {
        for (int i = 0; i < moves; i++)
        {
            robby.makeRandomMove();

        }

    }
}