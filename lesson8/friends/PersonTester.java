package friends;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        System.out.println(sara);
        System.out.println("Expected: Person[id=1,name=Sara]");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");
        Person buffy = new Person("Buffy");
        Person john = new Person("John");
        System.out.println(john);
        System.out.println("Expected: Person[id=5,name=John]");
    }
}