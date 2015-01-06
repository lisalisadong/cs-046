package ps9.comparableCircle;

import java.util.Arrays;
/**
 * Write a description of class ComparableTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparableTester
{
    public static void main(String[] args)
    {
        UnitCircle[] circles = new UnitCircle[4];
        circles[0] = new UnitCircle(8);
        circles[1] = new UnitCircle(3);
        circles[2] = new UnitCircle(9);
        circles[3] = new UnitCircle(1);

        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));
        System.out.println("Expected: [UnitCircle[r=1], UnitCircle[r=3], UnitCircle[r=8], UnitCircle[r=9]]");

        int compare = circles[0].compareTo(circles[3]);
        System.out.println((compare < 0));
        System.out.println("Expected: true");
    }
}