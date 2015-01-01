package scores2;

// BlueJ project: lesson7/scores2

// Implement the sumScores Method.

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
     * Calculates the Sum of all the scores entered.
     * @return the sum of all the scores in scores.
     */
    public double sumScores()
    {
        // YOUR CODE HERE
        // Sum all the scores that have been entered so far and
        // return the result.
    	double sum = 0;
    	for (double score : scores)
    	{
    		sum = sum + score;
    	}
        return sum;
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
     * Builds an easy-to-read description of the scores in the object.
     * @return A description of the scores.
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(scores, currentSize));
    }
}