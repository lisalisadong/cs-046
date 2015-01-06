package measure2;

// BlueJ project: lesson9/measure2
public class Data
{
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects)
    {
        double sum = 0;
        for (Country obj : objects)
        {
            sum = sum + obj.getArea();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    /**
       Computes the average fuel efficency of the given cars.
       @param objects an array of Car objects
       @return the average of the fuel efficiencies
    */
    public static double average(Car[] objects)
    {
        // TODO: Compute the average fuel efficiency
    	double sum = 0;
    	for (Car obj : objects)
    	{
    		sum = sum + obj.getFuelEfficiency();
    	}
    	if (objects.length > 0)
    	{
    		return sum / objects.length;
    	}
    	else
    	{
    		return 0;
    	}
    }
}