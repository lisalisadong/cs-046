package ps7.question3;

//This problem will use the same data as the previous one. This time you are
//to complete the TemperatureDifferenceCalculator. It has two methods:
//
//public double maxDifference() - Calculates the maximum difference between
//any two consecutive days. If Jan 7 temperature is 5 degrees and
//Jan 8 is -10 degrees, the difference between the two temperatures is 15.
//The temperature changed 15 degrees between one day and the next. The difference
// is always the absolute value..
//
//public double minDifference() - Calculates the minimum difference between
//any two consecutive days
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 3" for some tips on 
// how to begin.

public class TemperatureDifferenceCalculator
{
    private double[] data;

    /**
     * Constructs a TemperatureDifferenceCalculator with the given array
     * @param the array to process
     */
    public TemperatureDifferenceCalculator(double[] list)
    {
        data = list;
    }

    /**
     * Gets the maximum difference between any two consecutive values
     * @return the maximum difference
     */

      // TODO: add the stub for the maxDifference method. That is the header, the braces, and the return statement
    public double maxDifference()
    {
    	double maxDf = Math.abs(data[0] - data[1]);
    	for (int i = 0; i < data.length - 1; i ++)
    	{
    		maxDf = Math.max(Math.abs(data[i] - data[i + 1]), maxDf);    			
    	}
    	return maxDf;
    }

    /**
     * Gets the minimum difference between any two consecutive values
     * @return the minimum difference
     */

    // TODO: add the stub for the minDifference method. That is the header, the braces, and the return statement
    public double minDifference()
    {
    	double minDf = Math.abs(data[0] - data[1]);
    	for (int i = 0; i < data.length - 1; i ++)
    	{
    		minDf = Math.min(Math.abs(data[i] - data[i + 1]), minDf);    			
    	}
    	return minDf;
    }
}