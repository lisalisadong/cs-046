package ps7.question3;

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
public class DifferenceTester
{
    public static void main(String[] args) throws Exception
    {
        //set up a Scanner
        URL dataURL = new URL("http://academic.udayton.edu/kissock/http/Weather/gsod95-current/AKANCHOR.txt");
        InputStream dataIn = dataURL.openStream();
        Scanner in = new Scanner(dataIn, "UTF-8");
        
        //initialize array with January temperatures
        final int DAYS_IN_JANUARY = 31;
        double[] januaryTemperatures = new double[DAYS_IN_JANUARY];
        fillArray(januaryTemperatures, in);
        
         //initialize array with February temperatures
        final int DAYS_IN_FEBRUARY = 28;
        double[] februaryTemperatures = new double[DAYS_IN_FEBRUARY];
        fillArray(februaryTemperatures, in);
        
        in.close();

       TemperatureDifferenceCalculator calculator; 
       calculator = new TemperatureDifferenceCalculator(januaryTemperatures);
       System.out.println(calculator.maxDifference());
       System.out.println("Expected: 16.7");
       System.out.printf("%.1f\n",calculator.minDifference());
       System.out.println("Expected: 0.2");
       
       calculator = new TemperatureDifferenceCalculator(februaryTemperatures); 
       System.out.println(calculator.maxDifference());
       System.out.println("Expected: 10.8");
       System.out.println(calculator.minDifference());
       System.out.println("Expected: 0.0");
    }

    // Fills the array with data obtained from the Scanner
    private static void fillArray(double[] data, Scanner in)
    {
        for (int i = 0; i < data.length; i++)
        {
            in.next();
            in.next();
            in.next();
            double input = in.nextDouble();
            data[i] = input;
        }   
    }
}