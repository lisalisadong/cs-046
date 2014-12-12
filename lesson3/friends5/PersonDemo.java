package friends5;

public class PersonDemo
{
    public static void main(String[] args)
    {
        Person sara = new Person("Sara", "./predefined/pic/sara.jpg", 10, 200);
        Person chenghan = new Person("Cheng-Han", "./predefined/pic/cheng-han.png", 300, 0);
        Person cay = new Person("Cay", "./predefined/pic/cay.gif", 250, 180);
        
        sara.addFriend(cay);
        sara.addFriend(chenghan);
    }
}