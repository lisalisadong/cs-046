package carShare4;

public class Person
{
    private String name;
    private int destination;

    public Person(String name, int destination)
    {
        this.name = name;
        this.destination = destination;
    }

    public String getName()
    {
        return name;
    }

    public int getDestination()
    {
        return destination;
    }

    public String toString()
    {
        return name;
    }
}