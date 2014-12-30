package ps5.countNonVowels;

//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        //TODO Write the code to return the number of non-vowels
    	int count = 0;
    	for (int i = 0; i < word.length(); i ++)
    	{
    		if (!"aeiouAEIOU".contains(word.substring(i, i + 1)))
    		{
    			count ++;
    		}
    	}
    	return count;
    }
}
