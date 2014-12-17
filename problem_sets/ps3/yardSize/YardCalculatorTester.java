package ps3.yardSize;

// You don't need to modify this file

public class YardCalculatorTester
{
    public static void main(String[] args)
    {
        double length = 40.0;
        double width = 30.0;

        YardCalculator calculator = new YardCalculator(length, width); 
        
        double perimeter = calculator.perimeter();
        double area = calculator.area();
        double diagonal = calculator.diagonal();

        System.out.println("perimeter: " + perimeter);
        System.out.println("Expected: 42.672");
        System.out.println("diagonal: " + diagonal);
        System.out.println("Expected: 15.24");

        length = 60.1;
        width = 35.5;
        
        calculator = new YardCalculator(length, width); 
        perimeter = calculator.perimeter();
        area = calculator.area();
        diagonal = calculator.diagonal();

        System.out.printf("perimeter: %.2f\n", perimeter);
        System.out.println("Expected: 58.28");
        System.out.printf("area: %.2f\n", area);
        System.out.println("Expected: 198.21");
        System.out.printf("diagonal: %.2f\n", diagonal);
        System.out.println("Expected: 21.28");        
    }
}