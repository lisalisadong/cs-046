package ps8.fill2D;

import java.util.Arrays;

public class ArrayUser
{
    public static void main(String[] args)
    {
        String[][] matrix = new String[3][2];
        ArrayUtil.fill2D(matrix);
        print(matrix);
        
        System.out.println();
        String[][] matrix2 = new String[2][3];
        ArrayUtil.fill2D(matrix2);
        print(matrix2);
    }
    
    private static void print(String[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
           System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
