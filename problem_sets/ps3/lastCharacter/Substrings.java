package ps3.lastCharacter;

/**
 * Complete the method to return the last character of the parameter as a String
 * (use substring)
 */
public class Substrings
{
   /**
    * Gets the last character of the parameter
    * @param text the string we want the last character of
    * @return a string containing the last character
    */
   public String lastCharacter(String text)
   {
       //your code goes here
	   int length = text.length();
	   return text.substring(length - 1, length);
   }
}