package billionaire1;

// Bluej project: lesson6/billionaire1
// TODO: Change the program so that it will calculate the number of years
// to reach 1 billion dollars instead of 1 million.
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        int year = 0;

        while (balance < 1000000000)
        {
            double interest = balance * .01;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}