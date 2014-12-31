package gallery8;

import predefined.Picture;

// BlueJ project: lesson7/gallery8
// Find and draw the first portrait in the gallery.
// Notice the pseudocode from the instructions has been started for you; your task is to complete it. 

import java.util.ArrayList;

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
        
        int i = 0;
        boolean found = false;
        while (!found && i < gallery.size())
        {
        	if (gallery.get(i).getHeight() > gallery.get(i).getWidth())
        	{
        		found = true;
        	}
        	i ++;
        }
        
        if (found)
        {
            gallery.get(i - 1).draw();
        }
    }
}