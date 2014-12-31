package gallery7;

import predefined.Picture;

// BlueJ project: lesson7/gallery7
//Find the number of pictures in the ArrayList whose height is bigger than their width (portrait pictures)

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
        
        // Your code here
        int count = 0;
        for (Picture pic : gallery)
        {
        	if (pic.getHeight() > pic.getWidth())
        	{
        		count ++;
        	}
        }
        
        System.out.println("Pictures with portrait orientation: " + count);
    }
}