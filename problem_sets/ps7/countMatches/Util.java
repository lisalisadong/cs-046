package ps7.countMatches;

//
// Complete this method to return the number of zeros in the int array
// parameter, values
//

public class Util
{
    public int getCount(int[] values)
    {
        int count = 0;
        for (int current : values)
        {
            // TODO: count the number of zeros in values
        	if (current == 0)
        	{
        		count ++;
        	}
        }
        return count;
    }
}