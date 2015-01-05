package properties;

// BlueJ project lesson8/properties 
// Add the appropriate getter and setter methods for the instance variables.

import java.util.ArrayList;
import java.util.Arrays;

public class Car
{
    private int numberOfSeats; // Don't make this a settable property
    private String driverName;
    private ArrayList<String> passengers; // Not a property
    
    public String getDriverName() { return driverName; }
    public void setDriverName(String name) { driverName = name; }

    /**
        Constructs a car with a given number of seats
        @param numberOfSeats the number of seats in this car.
    */
    public Car(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
        passengers = new ArrayList<String>();
    }

    /**
       Adds a passenger to this car.
       @param name the name of the passenger
    */
    public void addPassenger(String name)
    {
        passengers.add(name);
    }

    /**
       Gets the number of occupants in this car.
       @return the number of occupants
    */
    public int getOccupantCount()
    {
        int count = passengers.size();
        if (driverName != null)
        {
            count++;
        }
        return count;
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