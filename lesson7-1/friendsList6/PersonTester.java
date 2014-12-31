package friendsList6;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");
        Person allegra = new Person("Allegra");
        Person kathleen = new Person("Kathleen");
        Person buffy = new Person("Buffy");

        sara.addFriend(chenghan);
        sara.addFriend(cay);
        sara.addFriend(allegra);
        sara.addFriend(kathleen);

        // Check the talkTo method
        sara.talkTo(allegra);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Allegra, Cheng-Han, Cay, Kathleen");
        sara.talkTo(cay);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cay, Allegra, Cheng-Han, Kathleen");
        // Talking to some one who is not a friend should change nothing:
        sara.talkTo(buffy);
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cay, Allegra, Cheng-Han, Kathleen");
    }
}