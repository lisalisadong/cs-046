package fields;

public class PlotTester
{
    public static void main(String[] args)
    {
        Plot plot = new Plot(1900, 4000);
        System.out.println(plot.getNumberOfFields(400));
        System.out.println("Expected: 8");
        System.out.println(plot.getNumberOfFields(300));
        System.out.println("Expected: 18");
    }
}