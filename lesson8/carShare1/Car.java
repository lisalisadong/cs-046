package carShare1;

// BlueJ project: lesson8/carshare1
    
import java.util.ArrayList;

public class Car
{
    private ArrayList<Person> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person>();
        this.driverName = driverName;
        this.numberOfSeats = numberOfSeats;
        location = 0;
        this.destination = destination;
    }

    /**
       Gets the name of this car's driver.
       @return the driver name
    */
    public String getDriverName()
    {
        return driverName;
    }

    /**
       Checks whether this car has arrived at its destination.
       @return true if the car has arrived
    */
    public boolean hasArrived()
    {
        return location == destination;
    }

    /**
       Tries to add a passenger.
       @param p the new passenger
       @return true if there is room in the car and the passenger's
       destination on the way to this car's destination
    */
    public boolean tryToAdd(Person p)
    {
        // TODO: Complete this method
    	boolean addStatus = passengers.size() + 1 < numberOfSeats && p.getDestination() <= destination;
    	if (addStatus)
    	{
    		passengers.add(p);
    	}
    	return addStatus;
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location
    */
    public void drive()
    {
        // Leave blank for now
    }
}