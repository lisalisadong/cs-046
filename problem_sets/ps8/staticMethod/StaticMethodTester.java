package ps8.staticMethod;

public class StaticMethodTester
{
    public static void main(String[] args)
    {
        double cost = 100;
        final double TAX_RATE = .09;
        
        double tax = Financial.getTax(TAX_RATE, cost);
        System.out.printf("%.2f\n", tax);
        System.out.println("Expected: 9.00");
        
        cost = 57.95;
        tax = Financial.getTax(TAX_RATE, cost);
        System.out.printf("%.2f\n", tax);
        System.out.println("Expected: 5.22");
    }
}