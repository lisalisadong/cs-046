package quiz4To5;

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

        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

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