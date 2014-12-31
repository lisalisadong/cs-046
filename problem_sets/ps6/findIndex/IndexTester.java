package ps6.findIndex;

import java.util.ArrayList;
public class IndexTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Houston");
       cities.add("San Jose");
       cities.add("Seattle");  
       cities.add("Denver");     
       
       Finder finder = new Finder();
       
       System.out.println(finder.getIndex(cities, "C"));
       System.out.println("Expected: 0");
       
       System.out.println(finder.getIndex(cities, "S"));
       System.out.println("Expected: 2");
       
       System.out.println(finder.getIndex(cities, "D"));
       System.out.println("Expected: 4");
       
       System.out.println(finder.getIndex(cities, "X"));
       System.out.println("Expected: -1");
       

   }
}