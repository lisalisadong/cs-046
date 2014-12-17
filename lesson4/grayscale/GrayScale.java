package grayscale;

public class GrayScale
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("./predefined/pic/eliza.jpg");
        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.turnGray();
            pic.setColorAt(i, c);
        }
    }
}