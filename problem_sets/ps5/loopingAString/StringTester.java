package ps5.loopingAString;

//
// Complete the code below to print each letter in the string name followed by a space.
// 
//
public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";

       //your code here
       for (int i = 0; i < name.length(); i++)
       {
    	   System.out.print(name.substring(i, i + 1) + " ");
       }
   }
}