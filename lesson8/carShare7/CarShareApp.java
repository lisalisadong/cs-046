package carShare7;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp
{
    public static void main(String[] args) throws IOException
    {
        Simulation sim = new Simulation();
        sim.read(new Scanner(new File("./lesson8/carShare7/input.txt")));
        sim.loadPassengers();
        sim.driveCars();
    }
}