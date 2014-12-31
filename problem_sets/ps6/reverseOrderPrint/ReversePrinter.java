package ps6.reverseOrderPrint;

//
// Complete the method in the class to print the elements in the array list in reverse order,
// one to a line.
//
// HINT: Use a for loop. Start with i = last index and work backwards.
//


import java.util.ArrayList;
public class ReversePrinter
{
   /**
    * prints the array list in reverse order, one to a line
    * @param text the array list to print
    */
    public void reversePrint(ArrayList<String> text)
    {
        // TODO: Write the code to print the elements in the array list in reverse order, one to a line.
    	for (int i = text.size() - 1; i >= 0; i --)
    	{
    		System.out.println(text.get(i));
    	}
    }
}