package movetester;

public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 60, 90);
        box.translate(25, 15);
        System.out.println(box.getX());
        System.out.println("Expected: 30");
        System.out.println(box.getWidth());
        System.out.println("Expected: 60");
    }
}
