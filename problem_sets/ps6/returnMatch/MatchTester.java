package ps6.returnMatch;

import java.util.ArrayList;
public class MatchTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Houston");
       cities.add("San Jose");
       cities.add("Seattle");  
       cities.add("Denver");     
       
       StringFinder finder = new StringFinder();
       
       System.out.println(finder.getTarget(cities, "C"));
       System.out.println("Expected: Chicago");
       
       System.out.println(finder.getTarget(cities, "S"));
       System.out.println("Expected: San Jose");
       
       System.out.println(finder.getTarget(cities, "D"));
       System.out.println("Expected: Denver");
       
       System.out.println(finder.getTarget(cities, "X"));
       System.out.println("Expected: null");
       

   }
}