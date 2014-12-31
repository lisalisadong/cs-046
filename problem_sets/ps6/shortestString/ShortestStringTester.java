package ps6.shortestString;

import java.util.ArrayList;

public class ShortestStringTester
{
   public static void main(String[] args)
   {
       StringArrayUtil story = new StringArrayUtil();
       
       ArrayList<String> words = new ArrayList<String>();
       words.add("Millicent");
       words.add("Brown");
       words.add("cooked");
       words.add("dinner");
       words.add("for");
       words.add("Austraila's");
       words.add("President");
      

       String shorty = story.shortestString(words);
       System.out.println(shorty);
       System.out.println("Expected: for");
       
       words.add("We");
       words.add("ate");
       words.add("too");
       shorty = story.shortestString(words);
       System.out.println(shorty);
       System.out.println("Expected: We");
   }
}