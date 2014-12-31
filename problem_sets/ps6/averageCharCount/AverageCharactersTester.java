package ps6.averageCharCount;

import java.util.ArrayList;

public class AverageCharactersTester
{
   public static void main(String[] args)
   {
       StringArrays story = new StringArrays();
       
       ArrayList<String> words = new ArrayList<String>();
       words.add("Strings");
       words.add("are");
       words.add("a");
       words.add("sequence");
       words.add("of");
       words.add("Unicode");
       words.add("characters");
       words.add("In");
       words.add("Java");
       words.add("a");
       words.add("character");
       words.add("is");
       words.add("a");
       words.add("value");
       words.add("of");
       words.add("the");
       words.add("type");
       words.add("char");

       double averageLength = story.averageCountPerWord(words);
       System.out.printf("%.1f\n",averageLength);
       System.out.println("Expected: 4.2");
       
       words.add("preposterous");
       averageLength = story.averageCountPerWord(words);
       System.out.printf("%.1f\n",averageLength);
       System.out.println("Expected: 4.6");
   }
}