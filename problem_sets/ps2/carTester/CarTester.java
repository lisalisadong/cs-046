package ps2.carTester;

import car6.Car;

//
// A class to exercise the Car class
// Use methods of the public interface (drive, addGas) to add 20 gallons to the tank
// drive 105 miles and add 5 gallons
// Add your code where specified. Do not change any other code
///
public class CarTester
{
   public static void main(String[] args)
   {
       Car mazda = new Car(35);
       

       // TODO: add your code to add 20 gallons to the tank, drive 105 miles, and add 5 gallons
       mazda.addGas(20);
       mazda.drive(105);
       mazda.addGas(5);
 
       
       //Don't need to modify the line below
       System.out.println(mazda.getGasInTank());
       System.out.println("Expected: 22.0");
   }
}
