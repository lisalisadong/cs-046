package ps6.shiftFirstToLast;

//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.  Put 10 pixels between pictures.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

import predefined.Picture;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("./predefined/pic/degas1.jpg"));
      gallery.add(new Picture("./predefined/pic/gaugin1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet2.jpg"));
      gallery.add(new Picture("./predefined/pic/renoir1.jpg"));

      // TODO Write code to shift the first picture (the one at index 0)
      // to the end of the array list and  display the pictures object in the modified list
      // horizontally.  Put 10 pixels between pictures.
      gallery.add(gallery.remove(0));
      
      int right = 0;
      for (Picture pic : gallery)
      {
    	  pic.translate(right + 10, 0);
    	  pic.draw();
    	  right = pic.getMaxX();
      }
   }
}