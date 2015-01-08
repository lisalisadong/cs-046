package twoDArrayTraverse;

public class MatrixEvenSumTester
{
    public static void main(String[] args)
    {
        int[][] array = { {1, 2, 3, 4},
                          {7, 8, 9, 10},
                          {2, 4, 6, 8}
                        };
       Matrix matrix = new Matrix(array);
       System.out.println(matrix.sumOfEvenNumbers());
       System.out.println("Expected: 44");
       
       array = new int[10][5];
       matrix = new Matrix(array);
       System.out.println(matrix.sumOfEvenNumbers());
       System.out.println("Expected: 0");
     }
}