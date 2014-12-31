package ps6.getInALoop;

//
// Complete this class. An array list of Strings called cities has been defined
// for you and populated
//
// You are to print the elements, one to a line (please use a for loop)
// Afterwards, print the element at index 2
//
//

import java.util.ArrayList;
public class GetAndLoopDemo
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");

       // TODO: Use a loop to print the elements one to a line
       // TODO: Print the element at index 2
       for (String city : cities)
       {
    	   System.out.println(city);
       }
       System.out.println(cities.get(2));
   }
}