package measure1;

public class AverageTester2
{
    public static void main(String[] args)
    {
        Country[] northAmericanCountries =
        {
            new Country("Bermuda", 69080),
            new Country("Canada", 34300083),
            new Country("Greenland", 57695),
            new Country("Mexico", 114975406),
            new Country("Saint Pierre and Miquelon", 5831),
            new Country("United States", 313847465),
        };

        double averageArea = Data.average(northAmericanCountries);
        System.out.printf("Average area: %.0f\n", averageArea);
        System.out.println("Expected: 77209260");
    }
}