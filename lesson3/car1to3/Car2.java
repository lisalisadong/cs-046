package car1to3;

import predefined.Picture;

public class Car2
{
    private double milesDriven;
    private double gasInTank;
    private Picture pic;

    public Car2() // Discussed later
    {
        milesDriven = 0;
        gasInTank = 0;
        pic = new Picture("./predefined/pic/car.jpg");
        pic.draw();
    }

    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    // More methods ...

}
