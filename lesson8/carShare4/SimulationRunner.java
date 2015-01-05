package carShare4;

import java.util.Scanner;

public class SimulationRunner
{
    public static void main(String[] args)
    {
        Simulation sim = new Simulation();
        sim.read(new Scanner(System.in));
        sim.loadPassengers();
        sim.driveCars();
    }
}