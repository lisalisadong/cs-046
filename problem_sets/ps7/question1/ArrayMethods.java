package ps7.question1;

import java.util.Arrays;

//
// Complete the methods below. These methods manipulate Arrays of Strings
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 1" for some tips on 
// how to begin.
//

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        int i = 1;
        while (sorted && i < list.length)
        {
        	if (list[i].compareTo(list[i - 1]) < 0)
        	{
        		sorted = false;
        	}
        	i ++;
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order).
     */
    public void replaceWithLargerNeighbor()
    {
    	for (int i = 1; i < list.length - 1; i ++)
    	{
    		if (list[i - 1].compareTo(list[i + 1]) > 0)
    		{
    			list[i] = list[i - 1];
    		}
    		else
    		{
    			list[i] = list[i + 1];
    		}
    	}

    }

    /**
     * Gets the number of duplicates in the array.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        for (int i = 0; i < list.length - 1; i ++)
        {
        	for (int j = i + 1; j < list.length; j ++)
        	{
        		if (list[j].compareTo(list[i]) == 0)
        		{
        			duplicates ++;
        		}
        	}
        }

        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        for (int i = 0; i < list.length; i ++)
        {
        	if (list[i].startsWith("x") || list[i].startsWith("y") || list[i].startsWith("z"))
        	{
        		String cache = list[i];
        		for (int j = i; j > insertAt; j --)
        		{
        			list[j] = list[j - 1];
        		}
        		list[insertAt] = cache;
        		insertAt ++;
        	}
        }
    }

    /**
     * gets the string representation of this array 
     * @returns the string representation of this array in
     * standard collection format
     * @return a string representation of the array. (do this with Arrays.toString(list))
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}