package dice;

import java.util.Scanner;

public class DieCaster
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of sides");
        int sides = in.nextInt();
        System.out.println("Number of throws");
        int numberOfThrows = in.nextInt();

        Die die = new Die(sides);
        for (int i = 1; i <= numberOfThrows; i++)
        {
            System.out.println(die.cast());
        }
        System.out.println();
    }
}