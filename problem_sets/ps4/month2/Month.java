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

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 1" for some tips on 
// how to begin.

//In MonthPrinter, ask the user for a number 1 to 12 and create a month object with that number

public class Month
{
    //instance variables
	private int month;

    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int theMonthNumber)
    {
    	if (theMonthNumber >= 1 && theMonthNumber <= 12)
    	{
    		month = theMonthNumber;
    	}
    	else
    	{
    		month = 1;
    	}
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
    	if (month == 1)
    	{
    		return "January";
    	}
    	else if (month == 2)
    	{
    		return "February";
    	}
    	else if (month == 3)
    	{
    		return "March";
    	}
    	else if (month == 4)
    	{
    		return "April";
    	}
    	else if (month == 5)
    	{
    		return "May";
    	}
    	else if (month == 6)
    	{
    		return "June";
    	}
    	else if (month == 7)
    	{
    		return "July";
    	}
    	else if (month == 8)
    	{
    		return "August";
    	}
    	else if (month == 9)
    	{
    		return "September";
    	}
    	else if (month == 10)
    	{
    		return "October";
    	}
    	else if (month == 11)
    	{
    		return "November";
    	}
    	else
    	{
    		return "December";
    	}
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
    	if (month == 2)
    	{
    		return 28;
    	}
    	else if ( month == 4 || month == 6 || month == 9 || month == 11)
    	{
    		return 30;
    	}
    	else
    	{
    		return 31;
    	}
    }
}