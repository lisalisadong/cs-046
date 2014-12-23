package billionaire2;

// Bluej project: lesson6/billionaire2
// TODO: Change the Program so that it will calculate the number of years
// to reach 1 million dollars when the interest rate is 10%
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        int year = 0;

        while (balance < 1000000)
        {
            double interest = balance * .1;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}