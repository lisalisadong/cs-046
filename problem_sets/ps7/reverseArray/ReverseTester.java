package ps7.reverseArray;

public class ReverseTester
{
   public static void main(String[] args)
   {
       int[] numbers = {1, 2, 3, 4};
       int[] numbers2 = {2, 4, 6, 8, 10};
       
       ArrayUtil util = new ArrayUtil();
       System.out.println(util.inReverse(numbers));
       System.out.println("Expected: 4 3 2 1 ");
       System.out.println(util.inReverse(numbers2));
       System.out.println("Expected: 10 8 6 4 2 ");
   }
}