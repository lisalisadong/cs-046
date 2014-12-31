package friendsList2;

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
        System.out.println(sara.getNumFriends());
        System.out.println("Expected: 1");

        sara.addFriend(cay);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay");
        System.out.println(sara.getNumFriends());
        System.out.println("Expected: 2");

        System.out.println(chenghan.getFriends());
        System.out.println("Expected: ");
    }
}