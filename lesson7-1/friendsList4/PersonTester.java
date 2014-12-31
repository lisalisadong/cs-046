package friendsList4;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");
        Person allegra = new Person("Allegra");
        Person kathleen = new Person("Kathleen");

        // Check the initial state of the friend object.
        System.out.println(sara.getFriends());
        System.out.println("Expected: ");

        // Check that adding the first friend works.
        sara.addFriend(chenghan);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han");
        System.out.println(sara.getNumFriends());
        System.out.println("Expected: 1");

        // Check that adding the second friend works.
        sara.addFriend(cay);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay");
        System.out.println(sara.getNumFriends());
        System.out.println("Expected: 2");

        // Check the getFriends with fancy separator method.
        sara.addFriend(allegra);
        sara.addFriend(kathleen);
        System.out.println(sara.getFriends("\u2764"));
        System.out.println("Expected Cheng-Han\u2764Cay\u2764Allegra\u2764Kathleen");
    }
}