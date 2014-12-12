package days;

import predefined.Day;

public class DaysAlivePrinter
{
    public static void main(String[] args)
    {
        Day birthDay = new Day(1951, 5, 26);
        Day lastDay = new Day(2012, 7, 23);
        System.out.print("LastDay: ");
        System.out.println(lastDay.toString());
        int daysAlive = lastDay.daysFrom(birthDay);
        System.out.print("Days alive: ");
        System.out.println(daysAlive);
    }
}
