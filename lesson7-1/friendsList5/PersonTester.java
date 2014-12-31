package friendsList5;

public class PersonTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara");
        Person chenghan = new Person("Cheng-Han");
        Person cay = new Person("Cay");
        Person buffy = new Person("Buffy");
        Person john = new Person("John");
        Person kathleen = new Person("Kathleen");
        Person voldemort = new Person("Voldemort");

        sara.addFriend(chenghan);
        sara.addFriend(cay);
        sara.addFriend(john);
        sara.addFriend(buffy);
        sara.addFriend(kathleen);

        sara.unfriend(buffy); // not sure why I added this person. I don't know any one named Buffy.
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay, John, Kathleen");
        sara.unfriend(john); // Dear John, I have found someone else...
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay, Kathleen");
        sara.unfriend(voldemort); // Just in case...
        System.out.println(sara.getFriends());
        System.out.println("Expected: Cheng-Han, Cay, Kathleen");
    }
}