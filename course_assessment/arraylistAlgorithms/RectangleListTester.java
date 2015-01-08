package arraylistAlgorithms;

import java.util.ArrayList;

import predefined.Rectangle;
/**
 * 
 */
public class RectangleListTester
{
    public static void main(String[] args)
    {
        RectangleList rectangleManager = new RectangleList();
        System.out.println(rectangleManager.largestPerimeter());
        System.out.println("Expected: null");
        
        rectangleManager.add(new Rectangle(20, 50, 25, 50));
        rectangleManager.add(new Rectangle(50, 80, 10, 30));
        rectangleManager.add(new Rectangle(30, 10, 10, 40));
        rectangleManager.add(new Rectangle(10, 20, 40, 45 ));
        rectangleManager.add(new Rectangle(80, 40, 30, 13));
        
        System.out.println(rectangleManager.largestPerimeter());
        System.out.println("Expected: Rectangle[x=10,y=20,width=40,height=45]");
        
        rectangleManager.add(new Rectangle(10, 40, 50, 40));
        System.out.println(rectangleManager.largestPerimeter());
        System.out.println("Expected: Rectangle[x=10,y=40,width=50,height=40]");
    }   
}