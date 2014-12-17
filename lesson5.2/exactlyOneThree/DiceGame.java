package exactlyOneThree;

// BlueJ Project: lesson5/exactlyOneThree

public class DiceGame
{
    /**
     * Calculates the score of a round of this game.
     * x the first roll
     * y the second roll
     * @return a score of 1 if exactly one is 3, a score of 0 otherwise
     */
    public int exactlyOneThree(int x, int y)
    {
        if ((x == 3 && y != 3) || (x != 3 && y == 3)) // TODO: if exactly one of x and y is 3
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
}