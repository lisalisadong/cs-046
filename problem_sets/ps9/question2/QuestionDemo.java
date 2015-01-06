package ps9.question2;

import java.util.Scanner;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Question first = new TrueFalseQuestion();
        first.setText("Albert Einstein was the inventer of Java.");
        first.setAnswer("false");
        
        Question second = new TrueFalseQuestion();
        second.setText("True or False: The original name for Java was Oak");
        second.setAnswer("TRUE");
        
        presentQuestion(first, in);
        presentQuestion(second, in);

    }
    /**
       Presents a question to the user and obtains a response.
       @param q the question to present
       @param in the scanner from which to read the user input
       @return the score (1 if correct, 0 if incorrect)
    */
    public static int presentQuestion(Question q, Scanner in)
    {
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        boolean outcome = q.checkAnswer(response);
        System.out.println(outcome);
        if (outcome)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}