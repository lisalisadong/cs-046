package ps6.displayLastPicture;

import predefined.Picture;

//
// Complete the given class to display the last picture in the array list
//
// The required pictures are in the BlueJ project
//

import java.util.ArrayList;

public class DisplayLastPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("./predefined/pic/degas1.jpg"));
      gallery.add(new Picture("./predefined/pic/gaugin1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet1.jpg"));
      gallery.add(new Picture("./predefined/pic/monet2.jpg"));
      gallery.add(new Picture("./predefined/pic/renoir1.jpg"));

      // TODO display the last picture in the array list
      // your code goes here
      gallery.get(gallery.size() - 1).draw();
   }
}