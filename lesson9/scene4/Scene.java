package scene4;

// BlueJ project: lesson9/scene4
import java.util.ArrayList;
import predefined.Canvas;

public class Scene
{
    public static void main(String[] args)
    {
        ArrayList<Drawable> elements = new ArrayList<Drawable>();
        Car car1 = new Car(100, 300);
        elements.add(car1);
        elements.add(new Car(250, 300));
        elements.add(new Car(250, 350));

        elements.add(new House(100, 150, 100, 100));
        elements.add(new House(250, 100, 150, 150));

        Dog dog1 = new Dog(200, 100, "./predefined/pic/Fido.jpg");
        elements.add(dog1);
        elements.add(new Dog(100, 400, "./predefined/pic/Rex.jpg"));
        elements.add(new Dog(200, 400, "./predefined/pic/Lucky.jpg"));

        for (Drawable d : elements)
        {
            d.draw();
        }

        // TODO: Also move Fido
        ArrayList<Moveable> things = new ArrayList<Moveable>();
        things.add(car1);
        things.add(dog1);

        for (int i = 1; i <= 10; i++)
        {
            for (Moveable m : things)
            {
            	m.move(1);
            }
            Canvas.snapshot();
        }
    }
}