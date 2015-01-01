package scores3;

// BlueJ project: lesson7/scores3

import java.util.Arrays;
import java.util.Scanner;

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double[] scores;
    private int currentSize; // The currentSize of the array of scores.

    /**
     * @param maxScores the maximum number of scores this object can hold.
     */
    public HomeworkScores(int maxScores)
    {
        scores = new double[maxScores];
        currentSize = 0;
    }

    /**
     * Calculates the average of all the scores collected so far.
     * @return the average of the scores in scores.
     */
    public double averageScore()
    {
        // TODO: Calculate the average score.
        // Add up all the scores and divide by the number of scores.
        // return the result.
    	double average = 0;
    	if (currentSize != 0)
    	{
    		average = sumScores() / currentSize;
    	}
        return average;
    }

    public void readScores(Scanner userInput)
    {
        while (userInput.hasNextDouble())
        {
            double nextScore = userInput.nextDouble();
            scores[currentSize] = nextScore;
            currentSize++;
        }
    }

    /**
     * Calculates the sum of all the scores entered.
     * @return the sum of all the scores in scores.
     */
    public double sumScores()
    {
        double sum = 0;
        for (int i = 0; i < currentSize; i++)
        {
            sum = sum + scores[i];
        }
        return sum;
    }

    /**
     * Builds an easy-to-read description of the scores in the object.
     * @return A description of the scores.
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(scores, currentSize));
    }
}