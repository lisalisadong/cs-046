package counting;

// BlueJ project: lesson8/counting

// TODO: Provide an instance variable for counting the passengers.
// TODO: Complete the addPassenger and getPassengerCount methods.

public class Car
{
    private int numberOfSeats;
    private int numberOfPassengers;

    /**
        Constructs a car with a given number of seats
        @param numberOfSeats the number of seats in this car.
    */
    public Car(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
        this.numberOfPassengers = 0;
    }


    /**
       Adds a passenger to this car, provided that there is space.
    */
    public void addPassenger()
    {
    	if (numberOfPassengers + 1 < numberOfSeats)
    	{
        	numberOfPassengers ++;
    	}
    }

    /**
       Gets the number of passengers in this car (not counting the driver).
       @return the number of passengers
    */
    public int getPassengerCount()
    {
    	return numberOfPassengers;
    }
}

