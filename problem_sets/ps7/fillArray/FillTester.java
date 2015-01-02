package ps7.fillArray;

import java.util.Arrays;
public class FillTester
{
    public static void main(String[] args)
    {
        ArrayProcessor processor = new ArrayProcessor();
        int[] numbers = new int[5];
        processor.fill(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Expected: [28, 33, 33, 20, 10]");
        
        numbers = new int[8];
        processor.fill(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Expected: [93, 29, 49, 97, 37, 60, 38, 47]");
    }
}