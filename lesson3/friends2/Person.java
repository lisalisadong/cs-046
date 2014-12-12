package friends2;

// BlueJ project: lesson3/friends2
// Video: Implementing Get Friends Method
public class Person
{
    private String name;
    private String friends;

    public Person(String aName)
    {
        name = aName;
        friends = "";
    }

   // This method returns the friends of this Person object
   // The method should return a String that contains all
   // the names of the friends of this Person object.
   public String getFriends()
   {
	   return friends;
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
