package numberPyramid;
//
// Write code in this main method to print a pyramid of numbers like this:
//
// 1
// 2   2
// 3   3   3
// 4   4   4   4
// 5   5   5   5   5
// 6   6   6   6   6   6
// 7   7   7   7   7   7   7
// 8   8   8   8   8   8   8   8
// 9   9   9   9   9   9   9   9   9
//10  10  10  10  10  10  10  10  10  10
//
// You must use nested loops. Do not print each row individually.
// To format your table like the model, use a printf statement like this:
// System.out.printf("%4d", ... );
//
//
public class NumberPyramid
{
    /**
      prints rows of numbers
      @param rows the number of rows to print
    */
    public void print(int rows)
    {
        // TODO: implement the method to print the specified number of rows
    	for (int i = 0; i < rows; i++)
    	{
    		for (int j = 0; j <= i; j++)
    		{
    			System.out.printf("%4d", i + 1);
    		}
    		System.out.println();
    	}

    }
}