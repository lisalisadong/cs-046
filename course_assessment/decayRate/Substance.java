package decayRate;

// do not make any changes to this class
//originally developed by Cay Horstmann
public class Substance
{
   private double mass;
   private double rate;

   /**
      Constructs an object representing a decaying radioactive substance
      @param initialMass the initial mass
      @param rateOfDecayInPercent the annual rate of decay, as a percentage value
      (5% is entered as 5)
   */
   public Substance(double initialMass, double rateOfDecayInPercent)
   {
      mass = initialMass;
      rate = 1 - rateOfDecayInPercent / 100;
   }

   /**
      Gets the current mass of the substance.
      @return the current mass
   */
   public double getMass()
   {
      return mass;
   }

   /**
      Simulates the decay of this substance over one year.
      After this method call, the mass as been reduced by the rate of decay
   */
   public void decayOneYear()
   {
      mass = mass * rate;
   }
}