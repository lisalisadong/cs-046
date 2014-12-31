package gallery4;

// BlueJ project: lesson7/gallery4

import java.util.ArrayList;
import predefined.Picture;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("./predefined/pic/degas1.jpg"));
        gallery.add(new Picture("./predefined/pic/gaugin1.jpg"));
        gallery.add(new Picture("./predefined/pic/monet1.jpg"));
        gallery.add(new Picture("./predefined/pic/monet2.jpg"));
        gallery.add(new Picture("./predefined/pic/renoir1.jpg"));
        
        // TODO: Rotate the gallery so that the last picture
        // becomes the first one, the first the second, and so on. 
        gallery.add(0, gallery.get(gallery.size()-1));
        gallery.remove(gallery.size()-1);

        int rightmostX = 0;        
        for (Picture pic : gallery)
        {        
            pic.translate(rightmostX + 10, 0);
            rightmostX = pic.getMaxX();
            pic.draw();
        }
    }
}