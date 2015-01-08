package staticProject;

public class Finance
{
    public static double getTip(double costOfDinner)
    {
        final double TIP_RATE = .2;
        return costOfDinner * TIP_RATE;
    }
}