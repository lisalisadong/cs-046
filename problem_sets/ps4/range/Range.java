package ps4.range;

/**
 * Complete the method to return true if the parameter is between 0 and 100,
 * inclusive of both 0 and 100
 */
public class Range
{
    /**
     * Determine if the parameter is greater than or equal to 0 and less than or equal to 100
     * @param value the value to test
     * @return true if value is greater than or equal to 0 and less than or equal to 100
     * Otherwise return false
     */
    public boolean inRange(int value)
    {
    	return value >= 0 && value <= 100;
    }
}