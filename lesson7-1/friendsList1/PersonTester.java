package friendsList1;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");

        System.out.println(sara.getFriends());
        System.out.println("Expected: ");
        sara.addFriend(chenghan);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han");
        sara.addFriend(cay);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay");

        System.out.println(chenghan.getFriends());
        System.out.println("Expected: ");

        System.out.println(sara.getFriend(0));
        System.out.println("Expected: Cheng-Han");

        System.out.println(sara.getFriend(1));
        System.out.println("Expected: Cay");

        System.out.println(sara.getFriend(99).length());
        System.out.println("Expected: 0");
    }
}