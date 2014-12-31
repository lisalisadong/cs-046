package gallery5;

import predefined.Picture;

// BlueJ project: lesson7/gallery5

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
        int sum = 0;
        for (Picture pic : gallery)
        {
        	sum = sum + pic.getWidth();
        }

        System.out.println("Sum of widths: " + sum);
    }
}