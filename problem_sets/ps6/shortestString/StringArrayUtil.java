package ps6.shortestString;

//
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//

import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string to the hold the shortest string
      String shortest = words.get(0); //initialize

      // TODO: Write the code to find the shortest string
      for (String word : words)
      {
    	  if (word.length() < shortest.length())
    	  {
    		  shortest = word;
    	  }
      }

      return shortest;
   }
}