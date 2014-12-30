package ps5.product1ToN;

//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
        // TODO: Complete the function to return
        // the product of 1, ..., N-1, N
	   int product = 1;
	   for (int i = 1; i <= n; i ++)
	   {
		   product = product * i;
	   }
	   return product;
   }
}