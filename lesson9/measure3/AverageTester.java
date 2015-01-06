package measure3;

public class AverageTester
{
    public static void main(String[] args)
    {
        Country[] centralAmericanCountries =
        {
            new Country("Belize", 22966),
            new Country("Costa Rica", 51100),
            new Country("El Salvador", 21041),
            new Country("Guatemala", 108889),
            new Country("Honduras", 112492),
            new Country("Nicaragua", 130373),
            new Country("Panama", 75417)
        };

        double averageArea = Data.average(centralAmericanCountries);
        System.out.printf("Average area: %.0f\n", averageArea);
        System.out.println("Expected: 74611");

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