package dice;

public class DieTester
{
    public static void main(String[] args)
    {
        Die sixSided = new Die(6);
        final int THROWS = 10;
        for (int i = 1; i <= THROWS; i++)
        {
            System.out.print(sixSided.cast() + " ");
        }
        System.out.println();
        System.out.println("Expected: 3 4 1 3 1 2 6 3 2 6 ");

        Die eightSided = new Die(8);
        for (int i = 1; i <= THROWS; i++)
        {
            System.out.print(eightSided.cast() + " ");
        }
        System.out.println();
        System.out.println("Expected: 6 1 6 1 3 8 3 6 6 1 ");
    }
}