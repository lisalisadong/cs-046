package twoDArraySetLast;

import java.util.Arrays;
public class MatrixSetLastTester
{
     public static void main(String[] args)
    {
        int[][] array = { {1, 2, 3, 4},
                          {7, 8, 9, 10},
                          {2, 4, 6, 8}
                        };
       Matrix matrix = new Matrix(array);
       matrix.setLast(19);
       int[] lastRow = matrix.getLastRow();
       System.out.println(Arrays.toString(lastRow));
       System.out.println("Expected: [2, 4, 6, 19]");
       
       array = new int[10][5];
       matrix = new Matrix(array);
       matrix.setLast(25);
       lastRow = matrix.getLastRow();
       System.out.println(Arrays.toString(lastRow));
       System.out.println("Expected: [0, 0, 0, 0, 25]");
     }
}