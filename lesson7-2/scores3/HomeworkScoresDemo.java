package scores3;

import java.util.Scanner;
public class HomeworkScoresDemo
{
    public static void main(String[] args)
    {
        // Let's assume you won't enter more than 500 scores for a student.
        HomeworkScores scores = new HomeworkScores(500);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter scores, Q to quit: ");
        scores.readScores(in);

        System.out.println("Total: " + scores.sumScores());
        System.out.println("Average: " + scores.averageScore());
    }
}