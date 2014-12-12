package friends6;

// This you for your reference only. There is no need to modify this file.

public class PersonDemoTester
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara", "./predefined/pic/sara.jpg", 10, 200);
        Person chenghan = new Person("Cheng-Han", "./predefined/pic/cheng-han.png", 300, 0);
        Person cay = new Person("Cay", "./predefined/pic/cay.gif", 250, 180);
                
        sara.makeMutualFriend(cay);
        sara.makeMutualFriend(chenghan);
        cay.makeMutualFriend(chenghan);
        sara.mutualUnfriend(cay);

        System.out.println("Sara's friends: " + sara.getFriends());
        System.out.println("Expected: Cheng-Han " );
    }
}