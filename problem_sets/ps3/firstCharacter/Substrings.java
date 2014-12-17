package ps3.firstCharacter;

/**
 * Complete the method to return the first character of the parameter as a String
 * (use substring)
 */
public class Substrings
{
   /**
    * Gets the first character of the parameter
    * @param text the string we want the first character of
    * @return a stringf containing the first character
    */
   public String firstCharacter(String text)
   {
       //your code goes here
	   return text.substring(0, 1);
   }
}