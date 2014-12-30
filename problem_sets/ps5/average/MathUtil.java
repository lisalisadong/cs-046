package ps5.average;

// hw05_11
//
// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
//
// Keep a running total and keep track of the number of entries
// then find and return the average
//
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
        int total = 0;
        int entries = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
        	int score = in.nextInt();
        	if (score < 0 && entries != 0)
        	{
        		return 1.0 * total / entries;
        	}
        	else if (score < 0 && entries == 0)
        	{
        		return 0;
        	}
        	else
        	{
        	total = total + score;
        	entries ++;
        	System.out.print("Enter a score. -1 to quit: ");
        	}
        }
        System.out.print("Input error: not integer! ");
        return 0;
    }
}