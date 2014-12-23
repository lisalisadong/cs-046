package infinite;

// BlueJ project: lesson6/infinite
// Video: Infinite

// TODO: Fix the error so that the loop stops
// when the balance has reached the target

import java.util.Scanner;

public class Interest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Target: ");
        double balance = 100;
        double target = in.nextDouble();
        double rate = 0.01;
        int year = 0;
        while (balance < target)
        {
            double interest = balance * rate;
            balance = balance + interest;
            year++;
            System.out.printf("Year %d: %8.2f\n",
                              year, balance);
        }
    }
}