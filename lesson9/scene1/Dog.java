package scene1;

import predefined.Picture;
import predefined.Text;

public class Dog
{
    private Picture pic;
    private Text name;

    public Dog(int x, int y, String file)
    {
        pic = new Picture(file);
        pic.translate(x, y);
        name = new Text(x, y + pic.getHeight(),
                        file.substring(0, file.indexOf(".")));
    }

    public void draw()
    {
        pic.draw();
        name.draw();
    }
}