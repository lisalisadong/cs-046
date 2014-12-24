package ps4.gradeBook;

//hw04_07
/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    /*
     * Gets the letter grade associated with this numeric grade
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */
    public String getLetterGrade(int grade)
    {
    	if (grade >= 90)
    	{
    		return "A";
    	}
    	else if (grade >= 80)
    	{
    		return "B";
    	}
    	else if (grade >= 70)
    	{
    		return "C";
    	}
    	else if (grade >= 60)
    	{
    		return "D";
    	}
    	else
    	{
    		return "F";
    	}
    }
}