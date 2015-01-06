package ps8.manipulatingPictures;

import predefined.Picture;

public class PictureManipulationDemo
{
    public static void main(String[] args)
    {
        final int SPACER = 10;
        Picture pic = new Picture("./predefined/pic/renoir1.jpg");
        pic.draw();
        Picture flipped = PictureUtil.grayAndFlipLeftToRight(pic);
        flipped.translate(pic.getWidth() + SPACER, 0);
        flipped.draw();
        Picture rotated =  PictureUtil.grayAndRotate90(pic);
        rotated.translate(2 * pic.getWidth() + 2 * SPACER, 0);
        rotated.draw();

    }

}