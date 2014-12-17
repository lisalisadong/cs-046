package exactlyOneThree;

public class DiceGameTester
{
    public static void main(String[] args)
    {
        DiceGame game = new DiceGame();
        System.out.println("Actual: " + game.exactlyOneThree(3, 3));
        System.out.println("Expected: 0");
        System.out.println("Actual: " + game.exactlyOneThree(3, 1));
        System.out.println("Expected: 1");
        System.out.println("Actual: " + game.exactlyOneThree(1, 3));
        System.out.println("Expected: 1");
        System.out.println("Actual: " + game.exactlyOneThree(1, 2));
        System.out.println("Expected: 0");
    }
}