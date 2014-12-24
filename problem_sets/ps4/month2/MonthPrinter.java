package ps4.month2;

//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January, 2 for February and so forth)
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1

//And 2 methods
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. Use Boolean operators (&&, ||, !).
//       You will have an if then else if then else.
//       For February return 28
//
//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user for a month number
//and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this
//June 30

//If the user enters an invalid month number print this error message: "Number must be 1 through 12"

//If the user enters a non-integer, give this error message: "Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified.

//For the draft:
//In Month, provide the constructor and the instance variable.

//In MonthPrinter, ask the user for a number 1 to 12 and create a month object with that number

/**
 * Exercises the methods in the Month class
 */
import java.util.Scanner;
public class MonthPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);

       System.out.print("Enter a month number (1 through 12) " );

       //your code here

       if (in.hasNextInt() == false)
       {
    	   System.out.println("Not an integer. Terminating");
       }
       else
       {
    	   int n = in.nextInt();
    	   if (n < 1 || n > 12)
    	   {
    		   System.out.println("Number must be 1 through 12");
    	   }
    	   else
           {
        	   Month month = new Month(n);
        	   System.out.println(month.getMonthName() + " " + month.getNumberOfDays());
           }
       }
       
   }
}