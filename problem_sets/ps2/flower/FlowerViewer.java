package ps2.flower;

// you don't need to change or modify this file

public class FlowerViewer
{
   public static void main(String[] args)
   {
       Flower rose = new Flower(50, 30);
       rose.draw();
       
       rose = new Flower(100, 60);
       rose.draw();
       
       rose = new Flower(0, 0);
       rose.draw();
   }
}