package rectableList;

import java.util.ArrayList;

import predefined.Rectangle;
/**
 * 
 */
public class RectangleListTester
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
        boxes.add(new Rectangle(20, 50, 25, 50));
        boxes.add(new Rectangle(50, 80, 10, 30));
        boxes.add(new Rectangle(30, 10, 10, 40));
        boxes.add(new Rectangle(10, 20, 40, 45 ));
        boxes.add(new Rectangle(80, 40, 30, 13));

        RectangleList rectangleManager = new RectangleList(boxes);
        System.out.println(rectangleManager.smallestArea());
        System.out.println("Expected: Rectangle[x=50,y=80,width=10,height=30]");
        
        boxes.add(new Rectangle(10, 40, 5, 25));
        System.out.println(rectangleManager.smallestArea());
        System.out.println("Expected: Rectangle[x=10,y=40,width=5,height=25]");

        boxes.clear();
        System.out.println(rectangleManager.smallestArea());
        System.out.println("Expected: null");
    }
    
}