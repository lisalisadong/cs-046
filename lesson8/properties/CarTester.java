package properties;

public class CarTester
{
    public static void main(String[] args)
    {
        Car fourSeater = new Car(4);
        System.out.println(fourSeater.getOccupantCount());
        System.out.println("Expected: 0");
        fourSeater.setDriverName("Jane");
        System.out.println(fourSeater.getOccupantCount());
        System.out.println("Expected: 1");
        fourSeater.addPassenger("Fred");
        System.out.println(fourSeater.getOccupantCount());
        System.out.println("Expected: 2");
        System.out.println(fourSeater.getDriverName());
        System.out.println("Expected: Jane");
        fourSeater.setDriverName("Lee");
        System.out.println(fourSeater.getOccupantCount());
        System.out.println("Expected: 2");
        System.out.println(fourSeater.getDriverName());
        System.out.println("Expected: Lee");
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: [Fred]");
    }
}