package measure2;

public class AverageTester
{
    public static void main(String[] args)
    {
        Car[] fleet =
        {
            new Car("2012 GMC Yukon XL", 14),
            new Car("2013 Honda Fit EV", 118),
            new Car("2012 Jaguar XF", 23),
            new Car("2011 Nissan Cube", 28),
            new Car("2012 Honda Odyssey", 22),
            new Car("2012 Mitsubishi Eclipse Spyder", 23)
        };

        double average = Data.average(fleet);
        System.out.printf("Average fuel efficiency: %.0f\n", average);
        System.out.println("Expected: 38");
    }
}