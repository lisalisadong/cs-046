package car4;

/**
 * Please Don't change this code. 
 * It is here so you can see the methods that belong to the car class.
 * You only need to change CarTester.java
 */
    
/**
 * A simulated car that consumes gas as it drives.
 */
public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;

    public Car()
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = 50;
    }

    /**
       Drives this car by a given distance.
       @param distance the distance to drive
    */
    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }
    
    /**
       Gets the current mileage of this car.
       @return the total number of miles driven
    */
    public double getMilesDriven()
    {
        return milesDriven;
    }

    /**
       Gets the current amount of gas in the tank of this car.
       @return the current gas level
    */
    public double getGasInTank()
    {
        return gasInTank;
    }
}