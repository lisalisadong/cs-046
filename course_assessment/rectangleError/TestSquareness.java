package rectangleError;

import java.util.Scanner;
import predefined.Rectangle;

public class TestSquareness
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter two integers ");
       int w = in.nextInt();
       int h = in.nextInt();
       Rectangle box = new Rectangle(0, 0, w, h);
       RectangularShape shape = new RectangularShape();
       System.out.println(shape.squareTester(box));
   }
}