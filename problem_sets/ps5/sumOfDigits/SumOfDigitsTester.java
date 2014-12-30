package ps5.sumOfDigits;

/**
 * Tester for method to find soum of odd digits
 */
public class SumOfDigitsTester
{
   public static void main(String[] args)
   {
       MathUtil util = new MathUtil();
       
       int value = util.sumOfOdd(765423);
       System.out.println (value);
       System.out.println("Expected: 3 2 4 5 6 7 0");
       
       value = util.sumOfOdd(-3431);
       System.out.println (value);
       System.out.println("Expected: 1 3 4 3 0");
   }
}