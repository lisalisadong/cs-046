package turningMathToJava;

public class MathInJavaTester
{
    public static void main(String[] args)
    {
        MathInJava mathObj = new MathInJava();
        System.out.println("amdahlSpeedup: ");
        System.out.println("Actual:   " + mathObj.amdahlSpeedup(0.5, 4));
        System.out.println("Expected: 1.6");
        System.out.println("Actual:   " + mathObj.amdahlSpeedup(0.1, 9));
        System.out.println("Expected: 5.0");

        System.out.println("crossRatio: ");
        System.out.println("Actual:   " + mathObj.crossRatio(1, 2, 3, 5));
        System.out.println("Expected: 1.5");
        System.out.println("Actual:   " + mathObj.crossRatio(1, 2, 4, 9));
        System.out.println("Expected: 1.3125");

        System.out.println("average: ");
        System.out.println("Actual:   " + mathObj.average(3, 4, 5, 4));
        System.out.println("Expected: 4");
        System.out.println("Actual:   " + mathObj.average(3, 4, 3, 3));
        System.out.println("Expected: 3.25");
    }
}