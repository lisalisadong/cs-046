package gallery3;

// BlueJ project: lesson7/gallery3

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

        int left = 0;
        for (Picture pic : gallery)
        {        
            // TODO: Move the first picture to offset 10, 
            // the second picture ten pixels to the right of the first one,
            // and so on
        	pic.translate(left + 10, 0);
        	left = pic.getMaxX();
        }
        
        for (Picture pic : gallery)
        {
            pic.draw();
        }
    }
}