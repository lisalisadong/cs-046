package measure5;

import measure4.Country;
import measure4.Data;

// BlueJ project: lesson9/measure5
public class LargestTester
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

        // TODO: We want this as a Country, not as Measurable, so we can
        // call getName. But it doesn't work. Fix the code so that it does.
        Country largestCountry = (Country) Data.largest(centralAmericanCountries);
        System.out.println("Largest country: " + largestCountry.getName());
        System.out.println("Expected: Nicaragua");
    }
}