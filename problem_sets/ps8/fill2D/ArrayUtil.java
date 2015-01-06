package ps8.fill2D;

//
// Complete the method to fill a 2D array of Strings with all X's ("X")
// Use nested loops
//
// Note that the method is static. It does not use the instance variables of
//the class. It gets all the information it needs as a parameter

public class ArrayUtil
{
     /**
     * Fills the given 2D array with X's ("X").
     * @param the array to ril
     */
    public static void fill2D(String[][] matrix)
    {
        // TODO:  Complete the method to fill a 2D array of Strings with all X's ("X")
    	if (matrix.length == 0)
    	{
    		return;
    	}
    	int row = matrix.length;
    	int column = matrix[0].length;
    	for (int i = 0; i < row; i ++)
    	{
    		for (int j = 0; j < column; j ++)
    		{
    			matrix[i][j] = "X";
    		}
    	}
    }

}