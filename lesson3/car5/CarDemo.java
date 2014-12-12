package car5;

import predefined.Text;

// you don't need to modify or change this file
public class CarDemo
{
    public static void main(String[] args)
    {     
        Car car1 = new Car(10, "./predefined/pic/hummer.jpg");
        Car car2 = new Car(50, "./predefined/pic/smart.jpg");
        car1.addGas(20);
        car1.drive(20);        
        car2.addGas(20);
        car2.drive(80);
        new Text(200, 120, "Gas left: " + car1.getGasInTank()).draw();
        new Text(800, 120, "Gas left: " + car2.getGasInTank()).draw();
    }
}