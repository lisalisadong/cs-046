package collecting2;

public class HomeworkScoresTester
{
    public static void main(String[] args)
    {
        HomeworkScores scores = new HomeworkScores();
        System.out.println(scores.getTotalExcludingLowest());
        System.out.println("Expected: 0");
        System.out.println("Expected: 0");
        scores.addScore(3);
        System.out.println(scores.getTotalExcludingLowest());
        System.out.println("Expected: 3");
        System.out.println("Expected: 3");
        scores.addScore(10);
        System.out.println(scores.getTotalExcludingLowest());
        System.out.println("Expected: 10");
        scores.addScore(9);
        System.out.println(scores.getTotalExcludingLowest());
        System.out.println("Expected: 19");
        scores.addScore(2);
        System.out.println(scores.getTotalExcludingLowest());
        System.out.println("Expected: 22");
        System.out.println("Expected: 2");
    }
}