package ps6.returnMatch;

/**
 * Complete the method in this class to return the first string
 * that starts with the target. Return null if no string starts with the target
 */

import java.util.ArrayList;
public class StringFinder
{
   /**
    * Gets the first String that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the first string starting with target or null if not found
    */
    public String getTarget(ArrayList<String> text, String target)
    {
        int i = 0;
        String startsWith = null;
        boolean found = false;
        while (!found && i < text.size()) //supply condition
        {
           //your codd goes here
        	if (text.get(i).startsWith(target))
        	{
        		startsWith = text.get(i);
        		found = true;
        	}
        	i ++;
        }
        return startsWith;
    }
}