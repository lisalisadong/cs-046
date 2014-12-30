package average;

// Bluej project: lesson6/average

import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class AverageDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        System.out.print("Enter a value, 0 to quit: ");

        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end

        double value = in.nextDouble();
        while (value > 0)
        {
        	sum = sum + value;
        	count ++;
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
        }
        	
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}