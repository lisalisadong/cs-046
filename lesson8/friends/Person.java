package friends;

// BlueJ project: lesson8/friends

import java.util.ArrayList;

public class Person
{
    private String name;
    private int id;
    private ArrayList<Person> friends;
    private static int lastId = 0;

    // TODO: Assign IDs 1, 2, 3, ... to each Person object
    // Use a static variable to track the last ID that was assigned.
    
    public Person(String name)
    {
        this.name = name;
        friends = new ArrayList<Person>();
        this.id = lastId + 1;
        lastId = this.id;
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend);
    }
    
    public String toString()
    {
        return "Person[id=" + id + ",name=" + name + "]";
    }
 
    /**
     * Gets the number of friends this Person has.
     * @return the number of friends.
     */
    public int getNumFriends()
    {
        return friends.size();
    }
}