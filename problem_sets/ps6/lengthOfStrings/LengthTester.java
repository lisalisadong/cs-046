package ps6.lengthOfStrings;

import java.util.ArrayList;
public class LengthTester
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Seattle");     

        ArrayListUtil util = new ArrayListUtil();
        util.getLengths(cities);
        System.out.println("\nExpected: 7 6 8 7 ");

        cities.remove("Seattle");
        util.getLengths(cities);
        System.out.println("\nExpected: 7 6 8");
    }
}