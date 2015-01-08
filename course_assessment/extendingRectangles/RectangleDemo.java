package extendingRectangles;

import java.util.Scanner;
public class RectangleDemo
{
    public static void main(String[] args)
    {
        UdacityRectangle box = new UdacityRectangle(20, 30, 70, 50);
        int area = box.area();
        System.out.println(area);
        
        box.grow(5, 10);
        int area2 = box.area();
        System.out.println(area2);
    }

}