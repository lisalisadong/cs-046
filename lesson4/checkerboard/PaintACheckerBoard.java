package checkerboard;

import predefined.Rectangle;
import predefined.Color;

/**
 * You don't need to do anything with this class,
 * but if you implement the CheckerBoardPainter,
 * this program will draw a checker board using your
 * code.
 */
public class PaintACheckerBoard
{
    public static void main(String[] args)
    {
        CheckerBoardPainter painter = new CheckerBoardPainter();
        for (int row = 0; row < 8; row++)
        {
            for (int col = 0; col < 8; col++)
            {
                Rectangle square = new Rectangle(row * 10, col * 10, 10, 10);
                if (painter.getColor(row, col) == 0)
                {
                    square.setColor(Color.BLUE);
                }
                else
                {
                    square.setColor(Color.RED);
                }
                square.fill();
            }
        }
    }
}