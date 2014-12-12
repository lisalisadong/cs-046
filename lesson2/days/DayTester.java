package days;

import predefined.Day;

public class DayTester
{
    public static void main(String[] args)
    {
        Day today = new Day(2010, 2, 15); // February 15, 2010
        today.addDays(30);

        System.out.println(today.getYear());
        System.out.println("Expected: 2010");
        System.out.println(today.getMonth());
        System.out.println("Expected: 3");
        System.out.println(today.getDayOfMonth());
        System.out.println("Expected: 13");
        System.out.println(today.daysFrom(today));
        System.out.println("Expected: 30");
    }
}
