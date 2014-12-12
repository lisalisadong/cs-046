package car5;

// BlueJ project: lesson3/cars5

// Complete the second constructor of this class.

import predefined.Picture;

public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    private Picture pic;

    public Car(double mpg)
    {
        milesDriven = 0;
        gasInTank = 0;
        milesPerGallon = mpg;
        pic = new Picture("car.jpg");
        pic.draw();
    }

    public Car(double mpg, String pictureFile)
    {
        // TODO: Complete this constructor
    	milesDriven = 0;
    	gasInTank = 0;
    	milesPerGallon = mpg;
    	pic = new Picture(pictureFile);
    	pic.draw();
    }

    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        double gasConsumed = distance / milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    public double getMilesDriven()
    {
        return milesDriven;
    }

    public double getGasInTank()
    {
        return gasInTank;
    }
}