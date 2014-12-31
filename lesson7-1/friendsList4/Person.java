package friendsList4;

// TODO
// Refactor the code to store an ArrayList of Person objects,
// in the list of friends (instead of just storing the names
// of the friends);

import java.util.ArrayList;

public class Person
{
    private String name;
    private ArrayList<Person> friends;

    public Person(String name)
    {
        this.name = name;
        friends = new ArrayList<Person>();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        return getFriends(", ");
    }

    /**
     * Returns the names of the friends with separator between them.
     * @param separator string to put between names.
     * @return the names of the friends.
     */
    public String getFriends(String separator)
    {
        String separatedFriends = "";
        if (friends.size() > 0)
        {
            separatedFriends = separatedFriends + friends.get(0).name;
        }
        for (int i = 1; i < friends.size(); i++)
        {
            separatedFriends = separatedFriends + separator + friends.get(i).name;
        }
        return separatedFriends;
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