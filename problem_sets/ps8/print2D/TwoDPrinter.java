package ps8.print2D;

public class TwoDPrinter
{
    public static void main(String[] args)
    {
        int[][] matrix = { {1, 2, 3, 4},
                           {9, 67, 222, 84},
                           {325, 555, 7, 123}
                         };
         // Note we do not need to make an object of type ArrayUtil to call
         // the method. The method is static
         ArrayUtil.print2D(matrix); 
         
         System.out.println();
         int[][] matrix2 = { {21, 12},
                             {81, 18},
                             {32, 23},
                             {54, 45}
                           };
          ArrayUtil.print2D(matrix2);
    }
}