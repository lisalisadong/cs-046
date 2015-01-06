package quiz6;

import java.util.Scanner;

import quiz1.Question;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // TODO: Set first to a Question that asks
        // who was the inventor of Java
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        NumericQuestion second = new NumericQuestion(0.01);
        second.setText("What is the length of the diagonal in a square whose sides have length 1?");
        second.setAnswer(Math.sqrt(2));

        int score = 0;
        score = score + presentQuestion(first, in);
        score = score + presentQuestion(second, in);
        System.out.println("Your score: " + score);
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
        System.out.println("Your answer:");
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