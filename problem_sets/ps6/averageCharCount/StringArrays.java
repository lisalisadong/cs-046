package ps6.averageCharCount;

//
// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
//
// Note that you want to keep the fractional part of the average
//
// Hint: If you do not know where to start, look at the ArrayList Algorithms to find an appropriate one.

import java.util.ArrayList;
public class StringArrays
{
   public double averageCountPerWord(ArrayList<String> words)
   {
       double average = 0;
       double count = 0.0; //defined as double so we do double division

       // TODO: Find the total number of characters in all the words
       for (String word : words)
       {
    	   count = count + word.length();
       }

       // TODO: Calculate the average
       if (words.size() != 0) //supply the condition
       {
          //your code here
    	   average = count / words.size();
       }

       return average;
    }
}