package clockTimes;

// lesson6/clock-times
//
// Write code that prints a table of all the possible times a digital
// clock can show. The clock only shows hours and minutes. 
// print the table this way : 
// 1:00 2:00 3:00 4:00 5:00 6:00 7:00 8:00 9:00 10:00 11:00 12:00 
// 1:01 2:01 3:01 4:01 5:01 6:01 7:01 8:01 9:01 10:01 11:01 12:01 
// 1:02 2:02 3:02 4:02 5:02 6:02 7:02 8:02 9:02 10:02 11:02 12:02 
// 1:03 2:03 3:03 4:03 5:03 6:03 7:03 8:03 9:03 10:03 11:03 12:03 
// 1:04 2:04 3:04 4:04 5:04 6:04 7:04 8:04 9:04 10:04 11:04 12:04 
// 1:05 2:05 3:05 4:05 5:05 6:05 7:05 8:05 9:05 10:05 11:05 12:05 
// ...
// 1:59 2:59 3:59 4:59 5:59 6:59 7:59 8:59 9:59 10:59 11:59 12:59 
public class ClockTimes
{
    public static void main(String[] args)
    {
        for (int minute = 0; minute < 60; minute++)
        {
            // YOUR CODE HERE
            // Use nested loops to count through all the hours 
            // and all the minutes, and print formatted strings. 
            // Hint: use %02d to print single digit numbers with 
            // a leading zero. The 0 means "zero-padded" check out
            // the fact sheet from lesson 4 to read about more 
            // formatting options. 
        	for (int hour = 1; hour < 13; hour ++)
        	{
        		System.out.printf("%d:%02d ", hour, minute);
        	}
        	System.out.println();
        }
    }
}