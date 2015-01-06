package measure2;

public class AverageTester2
{
    public static void main(String[] args)
    {
        Car[] trucksAndVans =
        {
            new Car("2013 Toyota Tacoma 2WD", 23),
            new Car("2013 GMC Savana 1500 2WD", 17),
            new Car("2013 Ford Transit Connect Wagon FWD", 24),
            new Car("2013 Ford F150 Pickup 4WD", 13),
            new Car("2013 GMC Yukon XL 2500 4WD", 12),
        };

        double average = Data.average(trucksAndVans);
        System.out.printf("Average fuel efficiency: %.0f\n", average);
        System.out.println("Expected: 18");
    }
}