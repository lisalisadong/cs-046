package counting;

public class CarTester
{
    public static void main(String[] args)
    {
        Car twoSeater = new Car(2);
        twoSeater.addPassenger();
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        twoSeater.addPassenger();
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        Car fourSeater = new Car(4);
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 1");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 2");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
    }
}