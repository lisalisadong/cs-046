package countingDown;

// Bluej project: counting_down
// Video: Counting Down 

// TODO:Make the loop count down the days left until vacation.
public class CountingDown
{
   public static void main(String[] args)
   {
       // TODO: Make this loop count down instead of up.
       // It should print
       //   20 days left
       //   19 days left
       //   18 days left
       // and so on, down to 0 days left.
       for (int i = 20; i > 0; i--)
       {
           System.out.println(i + " days left");
       }
   }
}