package countingMatchesDigits;

public class NumberTester
{
    public static void main(String[] args)
    {
        Number n1 = new Number(91924939L);
        System.out.println("Actual: " + n1.countMatchingDigits(9));
        System.out.println("Expected: 4" );
        System.out.println("Actual: " + n1.countMatchingDigits(3));
        System.out.println("Expected: 1" );
        System.out.println("Actual: " + n1.countMatchingDigits(5));
        System.out.println("Expected: 0" );
    }
}