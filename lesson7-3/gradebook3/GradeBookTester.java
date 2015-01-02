package gradebook3;

import java.util.Arrays;

public class GradeBookTester
{
    public static void main(String[] args)
    {
        GradeBook book = new GradeBook("./predefined/txt/grades.txt");
        double[] totals = book.totalsForAllTopics();
        System.out.println(Arrays.toString(totals));
        System.out.println("Expected: [158.0, 144.0, 166.0, 121.0, 154.0]");

        GradeBook book2 = new GradeBook("./predefined/txt/empty.txt");
        System.out.println(Arrays.toString(book2.totalsForAllTopics()));
        System.out.println("Expected: []");
    }
}