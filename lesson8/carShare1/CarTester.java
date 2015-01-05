package carShare1;

public class CarTester
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Fred", 4, 2);
        Person person1 = new Person("Joanne", 1);
        boolean result = car1.tryToAdd(person1);
        System.out.println("Trying to add Joanne going to destination 1: " + result);
        System.out.println("Expected: true");
        Person person2 = new Person("Cindy", 3);
        result = car1.tryToAdd(person2);
        System.out.println("Trying to add Cindy going to destination 3: " + result);
        System.out.println("Expected: false");
        car1.tryToAdd(new Person("Carl", 1));
        result = car1.tryToAdd(new Person("Jose", 2));
        System.out.println("Trying to add Jose going to destination 2: " + result);
        System.out.println("Expected: true");
        result = car1.tryToAdd(new Person("Voldemort", 1));
        System.out.println("Trying to add a passenger to a full car: " + result);
        System.out.println("Expected: false");
    }
}