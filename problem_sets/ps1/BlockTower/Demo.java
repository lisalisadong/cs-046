package ps1.blockTower;

import predefined.Ellipse;
import predefined.Picture;
import predefined.Canvas;
import predefined.Color;

public class Demo
{
   public static void main(String[] args)
   {
      Picture rocket = new Picture("rocket.jpg");
      rocket.translate(100, 600);
      rocket.draw();
      Canvas.snapshot();
      rocket.translate(100, -100);
      Canvas.snapshot();
      rocket.translate(100, -100);
      Canvas.snapshot();
      rocket.translate(100, -100);
      Canvas.snapshot();
      rocket.translate(100, -100);
      Ellipse earth = new Ellipse(0, 700, 50, 50);
      earth.setColor(Color.BLUE);
      earth.fill();
      Ellipse mars = new Ellipse(700, 0, 50, 50);
      mars.setColor(Color.RED);
      mars.fill();
   }
}
