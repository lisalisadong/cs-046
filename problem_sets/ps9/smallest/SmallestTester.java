package ps9.smallest;

public class SmallestTester
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

        Measurable smallest = Data.smallest(centralAmericanCountries);
        Country smallestCountry = (Country) smallest;
        System.out.println("Smallest country: " + smallestCountry.getName());
        System.out.println("Expected: El Salvador");
        
        
        Measurable[] cars = 
        {
            new Car("Smart", 36),
            new Car("Prius", 50),
            new Car("GMC Yukon", 17),
            new Car("Ferrari", 15)
        };
        
        smallest = Data.smallest(cars);
        Car worstGPA = (Car)smallest;
        System.out.println("Worst GPA: " + worstGPA.getModelName());
        System.out.println("Expected: Ferrari");
        
        
        
    }
}