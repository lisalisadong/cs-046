package measure4;

public class LargestTester
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

        Measurable largest = Data.largest(fleet);
        System.out.println("Most efficient car: " + largest);
        System.out.println("Expected: 2013 Honda Fit EV");
    }
}