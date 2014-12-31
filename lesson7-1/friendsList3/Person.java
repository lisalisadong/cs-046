package friendsList3;

import java.util.ArrayList;

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
     * Returns the names of the friends with separator between them.
     * @param separator string to put between names.
     * @return the names of the friends.
     */
    public String getFriends(String separator)
    {
        // TODO:
        // Create a string with all the names separated by separator.
        // make sure that there is not an extra trailing separator.
        // If my friends are Cay and Cheng-Han, and the separator is #
        // It should print
        // Cay#Cheng-Han
        // not
        // Cay#Cheng-Han#
        String allFriends = "";
        for (String friendName : friends)
        {
        	allFriends = allFriends + friendName + separator;
        }
        return allFriends.substring(0, allFriends.length() - separator.length());
    }

    /**
     * Gets the number of friends this Person has.
     * @return the number of friends.
     */
    public int getNumFriends()
    {
        return friends.size();
    }

    /**
     * Gets the ith friend.
     * @param i the index of the friend you want to get.
     * @return the ith friend's name.
     */
    public String getFriend(int i)
    {
        return friends.get(i);
    }
}