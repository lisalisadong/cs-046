package collecting;

// BlueJ project: lesson8/collecting

// TODO: Initialize the array list
// TODO: Implement the addPassenger and getPassengerCount methods

import java.util.ArrayList;

public class Car
{
    private int numberOfSeats;
    private ArrayList<String> passengers;

    /**
        Constructs a car with a given number of seats
        @param numberOfSeats the number of seats in this car.
    */
    public Car(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
        this.passengers = new ArrayList<String>();
    }

    /**
       Adds a passenger to this car, provided that there is space.
       @param name the name of the passenger
    */
    public void addPassenger(String name)
    {
    	if (passengers.size() + 1 < numberOfSeats)
    	{
    		passengers.add(name);
    	}
    }

    /**
       Gets the number of passengers in this car (not counting the driver).
       @return the number of passengers
    */
    public int getPassengerCount()
    {
    	return passengers.size();
    }

    /**
       Gets a list of all passengers in this car.
       @return a list of the form [name1, name2, ...]
    */
    public String getPassengerList()
    {
        return passengers.toString();
    }
}