package ps5.wordSubstring;

public class SubstringPrinter
{
   public static void main(String[] args)
   {
      Word word = new Word("rum");
      System.out.println(word.getSubstrings());   
      
      word = new Word("Udacity");
      System.out.println(word.getSubstrings()); 
   }

}