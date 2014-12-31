package friendsList3;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");
        Person allegra = new Person("Allegra");
        Person kathleen = new Person("Kathleen");

        sara.addFriend(chenghan);
        sara.addFriend(cay);
        sara.addFriend(allegra);
        System.out.println(sara.getFriends(" | "));
        System.out.println("Expected: Cheng-Han | Cay | Allegra");

        sara.addFriend(kathleen);
        System.out.println(sara.getFriends("\u2764"));
        System.out.println("Expected: Cheng-Han\u2764Cay\u2764Allegra\u2764Kathleen");

        sara.addFriend(new Person("Sammy Davis, Jr"));
        System.out.println(sara.getFriends("; "));
        System.out.println("Expected: Cheng-Han; Cay; Allegra; Kathleen; Sammy Davis, Jr");
    }
}