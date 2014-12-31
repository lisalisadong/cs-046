package ps6.verticalPictures;

import predefined.Picture;

//
// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

public class ListOfVerticalPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("./predefined/pic/degas1.jpg"));
      gallery.add(new Picture("./predefined/pic/gaugin1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet2.jpg"));
      gallery.add(new Picture("./predefined/pic/renoir1.jpg"));

      // your code goes here
      // TODO Write the code to display the pictures vertically
      int top = 0;
      for (Picture pic : gallery)
      {
    	  pic.translate(0, top + 10);
    	  pic.draw();
    	  top = pic.getMaxY();
      }
   }
}