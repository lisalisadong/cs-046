package gallery1;

// BlueJ project: lesson7/gallery1

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

        for (int i = 0; i < gallery.size(); i++)
        {
            Picture pic = gallery.get(i);
            pic.draw();
            pic.translate(100 * i, 0);
        }
    }
}