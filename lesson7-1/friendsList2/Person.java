package friendsList2;

import java.util.ArrayList;
// Implement the getNumFriends method.
public class Person
{
    private String name;
    private ArrayList<String> friends;

    public Person(String name)
    {
        this.name = name;
        friends = new ArrayList<String>();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend.name);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        String friendsWithBrackets = friends.toString();
        return friendsWithBrackets.substring(1, friendsWithBrackets.length() - 1);
    }

    /**
     * Gets a friend at a given index
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex
     */
    public String getFriend(int friendIndex)
    {
        return friends.get(friendIndex);
    }

    /**
     * Gets the number of friends this Person has.
     * @return the number of friends.
     */
    public int getNumFriends()
    {
        // YOUR CODE HERE
        // How would you do this without adding more than one line?
        // Think about ArrayList methods we talked about that might help you.
    	return friends.size();
    }
}