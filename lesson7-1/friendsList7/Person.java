package friendsList7;

// Implement the removeMeanFriends method

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
     * When a person talks to someone, if that person is already
     * a friend, they move to the front of the list. Otherwise nothing
     * changes.
     * @param the person to potentially move to the front of the friends list.
     */
    public void talkTo(Person person)
    {
        int oldIndex = find(person);
        if (oldIndex != -1)
        {
            friends.remove(oldIndex);
            friends.add(0, person);
        }
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
     * Removes nonFriend from the list of friends.
     * @param nonFriend the friend to remove
     */
    public void unfriend(Person nonFriend)
    {
        int nonFriendIndex = find(nonFriend);
        if (nonFriendIndex != -1)
        {
            friends.remove(nonFriendIndex);
        }
    }

    /**
     * Removes unrequited friendships. All Persons who do not have this
     * Person as a friend, are removed from this Person's friend list.
     */
    public void removeMeanFriends()
    {
        // YOUR CODE HERE
        // Remove all the friends who don't have you as a friend.
        // You may want to use the find method.
    	for (int i = 0; i < friends.size();i ++)
    	{
    		if (friends.get(i).find(this) == -1)
    		{
    			friends.remove(i);
    			i --;
    		}
    	}
    }

    /**
     * Finds friend in the friends list
     * @param a person to search for
     * @return -1 if the person is not found. The index of the person otherwise.
     */
    public int find(Person friend)
    {
        for (int i = 0; i < friends.size(); i++)
        {
            if (friends.get(i).equals(friend))
            {
                return i;
            }
        }
        // If the person is not found by the end of the friends list
        return -1;
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