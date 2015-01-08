package twoDArraySetLast;

// This Matrix class has a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, matrix
// Your task is to complete the setLast method to set the value of the element in the
// last column of the last row.

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
     * Sets the value of the element in the last column of the last row
     * @param value the value to set
     */
    public void setLast(int value)
    {
        //TODO: Set the value of the element in the last column of the last row to the parameter value
    	getLastRow()[getLastRow().length - 1] = value;
    }

    public int[] getLastRow()
    {
        return matrix[matrix.length - 1];
    }
}