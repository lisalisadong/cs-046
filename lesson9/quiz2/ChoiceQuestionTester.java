package quiz2;

public class ChoiceQuestionTester
{
    public static void main(String[] args)
    {
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);
        first.display();
        System.out.println("Expected: [*7, Duke, Oak, Gosling]");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        second.display();
        System.out.println("Expected: [Australia, Canada, Denmark, United States]");
    }
}