package sunsetInput;

// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

// TODO: Add import statement
import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("./predefined/pic/queen-mary.png");

        System.out.print("Added redness: ");
        // TODO: Read added redness from scanner
        Scanner in = new Scanner(System.in);
        int add_red = in.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(add_red); // TODO: Pass added redness to method
            pic.setColorAt(i, c);
        }
    }
}