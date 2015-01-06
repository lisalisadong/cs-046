package scene1;

// BlueJ project: lesson9/scene1
import java.util.ArrayList;

public class Scene
{
    public static void main(String[] args)
    {
        ArrayList<House> houses = new ArrayList<House>();
        houses.add(new House(100, 150, 100, 100));
        houses.add(new House(250, 100, 150, 150));

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(200, 100, "./predefined/pic/Fido.jpg"));
        dogs.add(new Dog(100, 400, "./predefined/pic/Rex.jpg"));
        dogs.add(new Dog(200, 400, "./predefined/pic/Lucky.jpg"));

        // Add cars at (100, 300), (250, 300), (250, 350)
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car(100, 300));
        cars.add(new Car(250, 300));
        cars.add(new Car(250, 350));

        for (House h : houses)
        {
            h.draw();
        }
        for (Dog d : dogs)
        {
            d.draw();
        }
        for (Car c : cars)
        {
        	c.draw();
        }
    }
}