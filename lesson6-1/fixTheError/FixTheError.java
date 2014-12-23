package fixTheError;

// Bluej project: lesson6/fix_the_error
// Video: Fix the Error 

// There is an error in this code.
// Careful! if you run it in the Udacity IDE you will not get good debugging information
// Try hand tracing or running in BlueJ instead.

// TODO: fix this code so that it prints the year and balance every year for
// 10 years.
public class FixTheError
{
    public static void main(String[] args)
    {
       int year = 1;
       double balance = 100;
       double rate = .01;
       while (year <= 10)
       {
           double interest = balance * rate;
           balance = balance + interest;
           System.out.printf("Year %d: %8.2f\n", year, balance);
           year ++;
       }
    }
}