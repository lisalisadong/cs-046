package ps5.inputWithDo;

//
// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
//

import java.util.Scanner;

public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        //TODO Write code to get a number in the range of 1 to 10
    	Scanner in = new Scanner(System.in);
        int input = 0;
    	do
    	{
            System.out.print("Enter an integer >=1 and <=10: "); 
    		if (in.hasNextInt())
    		{
    			input = in.nextInt();
    		}
    		else
    		{
    			System.out.print("Enter an integer >=1 and <=10: "); 
    		}
    	}
    	while (input < 1 || input > 10);
    	return input;
    }
}