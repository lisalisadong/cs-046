package elevator;

// Bluej project: elevator
// Video: The if Statement
import java.util.Scanner;

public class ElevatorDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();
        int actualFloor;

        // TODO: Modify the code to calculate the actual floor in a building with neither a 13 or 14 floor
        if (floor > 14)
        {
            actualFloor = floor - 2;
        }
        else
        {
            actualFloor = floor;
        }
        System.out.println("Actual floor: " + actualFloor);
    }
}