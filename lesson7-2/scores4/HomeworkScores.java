package scores4;

// BlueJ project: lesson7/scores4

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
     * Removes the lowest score.
     */
    public void removeLowest()
    {
        // YOUR CODE HERE
        // Remove the lowest score.
        // You can use any of the other methods in this class.
    	remove(find(lowScore()));
    }

    /**
     * Finds the first occurrence of the given score.
     * @param searchedValue the score to look for
     * @return the position of scoreToFind, -1 if it's not there
     */
    public int find(double searchedValue)
    {
        int pos = 0;
        boolean found = false;
        while (pos < currentSize && !found)
        {
            if (scores[pos] == searchedValue)
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }
        if (found)
        {
            return pos;
        }
        else
        {
            return -1;
        }
    }

    /**
     * Returns the lowest of the scores.
     * @return the lowest score
     */
    public double lowScore()
    {
        double lowestSoFar = scores[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (scores[i] < lowestSoFar)
            {
                lowestSoFar = scores[i];
            }
        }
        return lowestSoFar;
    }

    /**
     * Removes the score at the given position.
     * @param pos the position of the value to remove.
     */
    public void remove(int pos)
    {
        for (int i = pos + 1; i < currentSize; i++)
        {
            scores[i - 1] = scores[i];
        }
        currentSize--;
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