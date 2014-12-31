package friendsList7;

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
        Person cleo = new Person("Cleo");

        sara.addFriend(chenghan);
        sara.addFriend(cay);
        sara.addFriend(buffy);
        chenghan.addFriend(sara);
        allegra.addFriend(sara);
        kathleen.addFriend(sara);
        cay.addFriend(sara);
        cay.addFriend(buffy);
        sara.addFriend(buffy);
        sara.addFriend(allegra);
        sara.addFriend(cleo);
        sara.addFriend(kathleen);
        sara.removeMeanFriends();
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay, Allegra, Kathleen");

        buffy.addFriend(cay);
        buffy.addFriend(sara);
        buffy.removeMeanFriends();
        System.out.println(buffy.getFriends());
        System.out.println("Expected: Cay");
    }
}