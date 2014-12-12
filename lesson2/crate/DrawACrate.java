package crate;

import predefined.Line;
import predefined.Rectangle;

// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    public static void main(String[] args)
    {
        Rectangle face = new Rectangle(20, 30, 100, 40);
        face.draw();
        Line line1 = new Line(20, 30, 50, 10);
        line1.draw();
        Line line2 = new Line(120, 70, 150, 50);
        line2.draw();
        Line line3 = new Line(120, 30, 150, 10);
        line3.draw();
        Line line4 = new Line(50, 10, 150, 10);
        line4.draw();
        Line line5 = new Line(150, 10, 150, 50);
        line5.draw();
    }
}
