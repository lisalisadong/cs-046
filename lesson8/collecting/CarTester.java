package collecting;

public class CarTester
{
    public static void main(String[] args)
    {
        Car twoSeater = new Car(2);
        twoSeater.addPassenger("Fred");
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        System.out.println(twoSeater.getPassengerList());
        System.out.println("Expected: [Fred]");
        twoSeater.addPassenger("Bob");
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        System.out.println(twoSeater.getPassengerList());
        System.out.println("Expected: [Fred]");
        Car fourSeater = new Car(4);
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: []");
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 0");
        fourSeater.addPassenger("Pat");
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: [Pat]");
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 1");
        fourSeater.addPassenger("Lee");
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: [Pat, Lee]");
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 2");
        fourSeater.addPassenger("Phuong");
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: [Pat, Lee, Phuong]");
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
        fourSeater.addPassenger("Chris");
        System.out.println(fourSeater.getPassengerList());
        System.out.println("Expected: [Pat, Lee, Phuong]");
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
    }
}