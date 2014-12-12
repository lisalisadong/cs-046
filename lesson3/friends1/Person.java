package friends1;

// BlueJ project: lesson3/friend1
// Video: Checking the Person Class
//
public class Person
{
    private String name;
    private String friends;

    public Person(String aName)
    {
        name = aName;
        friends = "";
    }

    public void addFriend(Person friend)
    {
        friends = friends + " " + friend.name;
    }

    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(" " + nonFriend.name, "");
    }
}
