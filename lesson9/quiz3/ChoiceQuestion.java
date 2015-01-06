package quiz3;

// BlueJ project: lesson9/quiz3
import java.util.ArrayList;

import quiz1.Question;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
    private ArrayList<String> choices;

    /**
       Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        choices = new ArrayList<String>();
    }

    /**
       Adds an answer choice to this question.
       @param choice the choice to add
       @param correct true if this is the correct choice, false otherwise
    */
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);

        // TODO: If this is the correct choice,
        // set the choice number (1, 2, 3, 4) as the answer.
        // Tip #1: What's choices.size()?
        // Tip #2: Use "" + n to change n to a string
        if (correct)
        {
        	this.setAnswer("" + choices.size());
        }
    }

    public void display()
    {
        System.out.println("..."); // We'll fix this later
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}

