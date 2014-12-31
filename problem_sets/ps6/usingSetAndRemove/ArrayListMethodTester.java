package ps6.usingSetAndRemove;

//
// Complete this class. An array list of Strings called cities has been defined
// for you and partially populated. Add code to do the following:
// 1. Add the string "New York so that it is first in the arraylist
// 2. replace the string "Dallas" (should be at index 2. Don't search) with "Houston"
// 3. remove last element in the list
// 4. print the arraylist
//
//

import java.util.ArrayList;
public class ArrayListMethodTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");

       // TODO: Add code for steps 1-4 above
       cities.add(0, "New York");
       cities.set(2, "Houston");
       cities.remove(cities.size() - 1);
       System.out.println(cities);

       // TODO: Print the arraylist
       System.out.println("Expected: [New York, Chicago, Houston, San Jose]");
   }
}