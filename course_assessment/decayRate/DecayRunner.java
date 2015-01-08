package decayRate;

//developed by Cay Horstmann
// You are provided with a class, Substance, that represents a radioactive substance that
// decays at a uniform rate over time. Do not make any changes in that class.
// Just check the javadoc to see how to use the methods.
//
// The class has a method decayOneYear which simulates the decay after one year.
// The mass will be reduced by the appropriate amount each time the method is called.
//
// The class has a getMass method that returns the current mass of the substance.
//
// The DecayRunner class is started for you. It gets the initial mass and the rate of decay
// from the keyboard - as a percentage value (5% is entered as 5) And creates a Substance object
//
// You are to complete the main method so that it prints the mass at the end of each year
// to two decimal points. You can use printf format specifier "%.2f\n"
// Stop when the current mass is less than half the original mass of the substance
// And print the number of years taken to reach that mass
//
// Here is a sample runn
//Enter the initial mass: 100.0
//Enter the rate of decay as a percent: 5.0
//95.00
//90.25
//85.74
//81.45
//77.38
//73.51
//69.83
//66.34
//63.02
//59.87
//56.88
//54.04
//51.33
//48.77
//14
//

import java.util.Scanner;
/**
 * This application assumes a well-behaved user who always
 * enters valid data
 */
public class DecayRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial mass: ");
        double mass = in.nextDouble();
        System.out.print("Enter the rate of decay as a percent: ");
        double decayRate = in.nextDouble();

        Substance stuff = new Substance(mass, decayRate);

        // TODO:  prints the mass at the end of each year
        // to two decimal points. You can use printf format specifier "%.2f\n"
        // Stop when the current mass is less than half the original mass of the substance
        // TODO:  print the number of years it takes to reach that mass
        int year = 0;
        while (stuff.getMass() >= mass / 2)
        {
        	stuff.decayOneYear();
        	year++;
        	System.out.printf("%.2f\n", stuff.getMass());
        }
        System.out.println(year);

    }
}