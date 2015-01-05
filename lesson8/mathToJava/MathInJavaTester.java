package mathToJava;


public class MathInJavaTester
{
    public static void main(String[] args)
    {
        System.out.println("Actual:   " + MathInJava.amdahlSpeedup(0.5, 4));
        System.out.println("Expected: 1.6");
        System.out.println("Actual:   " + MathInJava.amdahlSpeedup(0.1, 9));
        System.out.println("Expected: 5.0");

        System.out.println("Actual:   " + MathInJava.crossRatio(1, 2, 3, 5));
        System.out.println("Expected: 1.5");
        System.out.println("Actual:   " + MathInJava.crossRatio(1, 2, 4, 9));
        System.out.println("Expected: 1.3125");

        System.out.println("Actual:   " + MathInJava.average(3, 4, 5, 4));
        System.out.println("Expected: 4");
        System.out.println("Actual:   " + MathInJava.average(3, 4, 3, 3));
        System.out.println("Expected: 3.25");
    }
}