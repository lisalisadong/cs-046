package measure3;

// BlueJ project: lesson9/measure3
public class Data
{
    /**
       Computes the average measure of the given objects.
       @param objects an array of Measurable objects
       @return the average of the measures
    */
    public static double average(Measurable[] objects)
    {
        // TODO: Compute the average measure
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
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