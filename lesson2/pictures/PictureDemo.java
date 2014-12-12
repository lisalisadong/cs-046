package pictures;

import predefined.Picture;

public class PictureDemo
{
    public static void main(String[] args)
    {
        Picture rocket = new Picture("./predefined/pic/mariner4.jpg");
        rocket.translate(200, 200);
        rocket.draw();
        Picture planet = new Picture("./predefined/pic/mars.gif");
        planet.grow(-50, -50);
        planet.draw();
    }
}
