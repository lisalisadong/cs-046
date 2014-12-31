package ps6.lengthOfStrings;

//
// Complete the method in this class to print the length of each string
// all on one line separated by spaces
//

import java.util.ArrayList;
public class ArrayListUtil
{
   /**
    * prints length of each string in the arraylist all on one line
    * @param text the array list to process
    */
    public void getLengths(ArrayList<String> text)
    {
        // TODO: Use a loop to print the length of each string all on one line separated by spaces
    	for (String word : text)
    	{
    		System.out.print(word.length() + " ");
    	}
    }
}