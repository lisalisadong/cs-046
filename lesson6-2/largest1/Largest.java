package largest1;

// BlueJ project: lesson6/largest1

// Read in the values that the user supplies, stopping
// when the user enters Q (or any other input that is
// not a number). Print out the largest value that
// the user entered.

import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values, Q to quit: ");
        double largest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            largest = Math.max(largest, input);
        }
        System.out.println("Largest value: " + largest);
    }
}