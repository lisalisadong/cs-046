package usingBooleans;

public class Word
{
    private String letters;
    
    public Word(String letters) 
    {
        this.letters = letters.toLowerCase();
    }
    
    /** Is the ith letter a vowel? */
    public boolean isVowel(int i)
    {
        // TODO your code here!
        // A little piece of code to get you started
    	String letter = letters.substring(i, i + 1);
        return letter.equals("a")
        	|| letter.equals("e")
        	|| letter.equals("i")
        	|| letter.equals("o")
        	|| letter.equals("u");
    }
    
    /** Is the ith letter a consonant? */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }
}