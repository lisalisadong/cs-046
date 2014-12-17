package checkerboard;

public class CheckerBoardPainterTester
{
    public static void main(String[] args)
    {
        CheckerBoardPainter painter = new CheckerBoardPainter();
        System.out.println("Actual: " + painter.getColor(3, 4));
        System.out.println("Expected: 1");
        System.out.println("Actual: " + painter.getColor(4, 3));
        System.out.println("Expected: 1");
        System.out.println("Actual: " + painter.getColor(4, 4));
        System.out.println("Expected: 0");
        System.out.println("Actual: " + painter.getColor(3, 3));
        System.out.println("Expected: 0");
    }
}