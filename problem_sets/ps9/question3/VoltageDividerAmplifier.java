package ps9.question3;

public class VoltageDividerAmplifier extends Amplifier
{
     // TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
     // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
     // VoltageDividerAmplifier:    g = R2 / (R1 + R2)
     // TODO: the getGain method needs to return the correct gain (g)
	public VoltageDividerAmplifier(int resistance1, int resistance2)
	{
		super(resistance1, resistance2);
	}
	
	public double getGain()
	{
		return 1.0 * super.getR2() / (super.getR1() + super.getR2());
	}
}