package gallery6;

import predefined.Picture;

// BlueJ project: lesson7/gallery6

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("./predefined/pic/degas1.jpg"));
        gallery.add(new Picture("./predefined/pic/guigou1.jpg"));
        gallery.add(new Picture("./predefined/pic/gaugin1.jpg"));
        gallery.add(new Picture("./predefined/pic/monet1.jpg"));
        gallery.add(new Picture("./predefined/pic/seurat1.jpg"));
        
        // Your code here
        Picture tallest = new Picture();
        for (Picture pic : gallery)
        {
        	if (pic.getHeight() > tallest.getHeight())
        	{
        		tallest = pic;
        	}
        }

        System.out.println("Tallest height: " 
           + tallest.getHeight());
        tallest.draw();
    }
}