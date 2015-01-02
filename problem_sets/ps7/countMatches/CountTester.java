package ps7.countMatches;

public class CountTester
{
    public static void main(String[] args)
    {
        Util tester = new Util();
        int[] numbers = {0, 5, 0, 6, 0, 0, 8, 0};
        System.out.println(tester.getCount(numbers));
        System.out.println("Expected: 5");
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(tester.getCount(numbers2));
        System.out.println("Expected: 0");
    }
}