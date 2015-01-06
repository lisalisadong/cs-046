package quiz6;

// BlueJ project: lesson9/quiz6
import java.util.ArrayList;

import quiz1.Question;

/**
   A question with a numeric answer.
*/
public class NumericQuestion extends Question
// TODO: Specify superclass
{
    private double tolerance;
    // TODO: Provide any needed instance variables
    private double answer;

    /**
       Constructs a numeric question.
       @param aTolerance the tolerance that is allowed when
       checking the answer. For example, if tolerance is 0.01, then
       the response may be up to 0.01 away from the correct answer.
    */
    public NumericQuestion(double aTolerance)
    {
        this.tolerance = aTolerance;
    }

    public void setAnswer(double number)
    {
        // TODO: Implement this method
    	this.answer = number;
    }

    public boolean checkAnswer(String response)
    {
        // TODO: Implement this method
        // Hint: Double.parseDouble converts a string
        // containing digits and a decimal point
        // into a floating-point number. For example,
        // Double.parseDouble("3.14") is 3.14
    	return Math.abs(Double.parseDouble(response) - answer) <= tolerance;
    }
}