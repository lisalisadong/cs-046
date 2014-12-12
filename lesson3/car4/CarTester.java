package car4;

// BlueJ project: lesson3/cars4

// Write a tester program that prints the actual and
// expected gas level after the given method calls.

public class CarTester
{
    public static void main(String[] args)
    {
        Car car = new Car();

        // TODO: Add 20 gallons and drive 100 miles
        
        car.addGas(20);
        car.drive(100);

        // TODO: Print actual and expected gas level
        
        System.out.println(car.getGasInTank());
        System.out.println("Expected: " + 18);
    }
}