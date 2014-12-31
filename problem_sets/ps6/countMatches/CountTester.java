package ps6.countMatches;

import java.util.ArrayList;
public class CountTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");  
       cities.add("Denver");
       cities.add("Dayton");       
       
       Counter counter = new Counter(); 
       System.out.println(counter.getCount(cities, "S"));
       System.out.println("Expected: 2 ");
       
       System.out.println(counter.getCount(cities, "D"));
       System.out.println("Expected: 3 ");
       
       System.out.println(counter.getCount(cities, "A"));
       System.out.println("Expected: 0 ");
   }
}