package friends6;

import predefined.Picture;
import predefined.Line;
import predefined.SmallCircle;

// BlueJ project: lesson3/friends6
/**
 *   
 *   Models a person who makes and unmakes friends
 *
 */
public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;
  
    public Person (String name, String pictureName, int x, int y)
    {
        this.name = name;
        friends = "";
        Picture picture = new Picture(pictureName);
        this.x = x;
        this.y = y;
        picture.translate(x, y);
        picture.draw();
    }

    public void makeMutualFriend(Person friend)
    {
        this.addFriend(friend);
        friend.addFriend(this);
    }
    
    public void mutualUnfriend(Person nonFriend)
    {
      // TODO: complete this method
    	this.unfriend(nonFriend);
    	nonFriend.unfriend(this);
    }
    
    public void addFriend(Person friend)
    {
        friends = friends + friend.name + " ";
        SmallCircle circle = new SmallCircle(x, y);
        circle.fill();
        Line line = new Line(x, y, friend.x, friend.y);
        line.draw();
    }

    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name, "");
    }

    public String getFriends()
    {
        return friends;
    }

}