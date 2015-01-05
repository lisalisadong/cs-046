package collecting2;

// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double scores;
    private double lowest;
    
    public HomeworkScores()
    {
        scores = 0;
        lowest = 10;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        scores = scores + score;
        lowest = Math.min(score, lowest);
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
    	if (scores > lowest)
    	{
            return scores - lowest;
    	}
    	else
    	{
    		return scores;
    	}
    }

    /**
       Calculates the lowest score.
       @return the lowest score or 0 if there are no scores 
    */
    //private double getLowest()
    //{
    //	if (scores < lowest)
    //	{
    //		return 0;
    //	}
    //    return lowest;
    //}       
}
