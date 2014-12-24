package ps4.gasChecker;

/**
 * Complete the method below to simulate a warning light in a
 * car that is usually green but that turns red if the gas in the tank is
 * less than one gallon
 */
public class GasChecker
{
   /**
    * Determines if the fuel in the tank is low.
    * @param gasInTank the amount of fuel in the car's gas tank
    * @return "red" if the amount of gas in the tank is less than 1. Otherwise "green"
    */
    public String testGas(double gasInTank)
    {
    	if (gasInTank < 1)
    	{
    		return "red";
    	}
    	else
    	{
    		return "green";
    	}
    }
}