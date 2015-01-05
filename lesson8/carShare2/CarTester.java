package carShare2;

public class CarTester
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Fred", 4, 2);
        car1.tryToAdd(new Person("Joanne", 1));
        car1.tryToAdd(new Person("Jose", 2));
        car1.tryToAdd(new Person("Carl", 1));
        System.out.println(car1);
        System.out.println("Expected: Car[location=0,driverName=Fred,passengers=[Joanne, Jose, Carl]]");
        car1.drive();
        System.out.println(car1);
        System.out.println("Expected: Car[location=1,driverName=Fred,passengers=[Jose]]");
        car1.drive();
        System.out.println(car1);
        System.out.println("Expected: Car[location=2,driverName=Fred,passengers=[]]");
    }
}