package ps5.wordSubstring;

//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.
//
//For example, if the user provides the input "rum", the method returns a
//string that will print like this

//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 3" for some tips on 
// how to begin.

public class Word
{
	private String word;
	private int length;
	
    //TODO write the constructor and define the instance variable
	public Word (String word)
	{
		this.word = word;
		this.length = word.length();
	}

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */

    public String getSubstrings()
    {

       //TODO complete the stub to return null
    	String substrings = "";
    	for (int i = 1; i <= length; i ++)
    	{
    		for (int j = 0; j + i <= length; j ++)
    		{
    			substrings = substrings + word.substring(j, i + j) + "\n";
    		}
    	}
    	return substrings;
    }
}