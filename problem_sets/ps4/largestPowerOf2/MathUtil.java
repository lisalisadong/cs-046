package ps4.largestPowerOf2;

/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
   public int largestPowerOf2(int n)
   {
	   int i = 1;
	   for (; n - i > i; i = i * 2);
	   return i;
   }
}