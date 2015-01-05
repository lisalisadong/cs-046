package carShare5_6;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp
{
    public static void main(String[] args)
    {
        Simulation sim = new Simulation();
        sim.read(new Scanner(System.in));
        sim.loadPassengers();
        sim.driveCars();
    }
}