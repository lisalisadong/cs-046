package twoDArrayRows;

// This Matrix class has a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, matrix
// Your task is to complete the numberOfRows method to return the number of rows in the
// matrix


public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
       matrix = array;
    }

    /**
     * gets the number of rows
     * @return the number of rows
     */
    public int numberOfRows()
    {
    	return matrix.length;
    }
}