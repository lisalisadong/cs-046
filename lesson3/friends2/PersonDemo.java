package friends2;

public class PersonDemo 
{
    public static void main(String[] args)
    {
        Person maria = new Person("Maria");
        Person jamesha = new Person("Jamesha");
        Person tj = new Person("TJ");
        
        maria.addFriend(jamesha);
        maria.addFriend(tj);
        maria.unfriend(jamesha);

        System.out.println(maria.getFriends());
        System.out.println("Expected: TJ");
    }
}