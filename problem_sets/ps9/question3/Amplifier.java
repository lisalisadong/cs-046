package ps9.question3;

// In this problem you will create a class heirarchy of electronic circuits. You do not have
// to understand anything about circuits to do this problem. Just look at the specification
// for the Java classes (That is what I did)
//
// Here is a link to a diagram showing the kinds of operational amplifiers we will be
// working with
//
// The input to the amplifier is the voltage Vi and the output is the voltage Vo. The output
// of an amplifier is proportional to the input. The constant of proportionality is called
// the gain of the amplifier.

// You have been supplied with a class that models this Amplifier(a). It is the super class.
// You will write  the three subclasses: InvertingAmplifier(b), NoninvertingAmplifier(c), and
// VoltageDividerAmplifier(d).
//
// R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
// InvertingAmplifier:         g = R2 / R1
// NoninvertingAmplifier:      g = 1 + (R2 / R1)
// VoltageDividerAmplifier:    g = R2 / (R1 + R2)
//
// Each subclass will override the getGain method to return the appropriate gain
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 9 - Question 3" for some tips on 
// how to begin.
//
//You do not need to change this class
public class Amplifier
{
    private int r1;
    private int r2;

    /**
     * Constructs an operational Amplifier
     * @param resistance1 the first resistance
     * @param resistance2 the second resistance
     */
    public  Amplifier( int resistance1, int resistance2)
    {
        r1 = resistance1;
        r2 = resistance2;
    }

    /**
     * Gets the first resistance
     * @return the first resistance
     */
    public int getR1()
    {
        return r1;
    }

    /**
     * Gets the second resistance
     * @return the second resistance
     */
    public int getR2()
    {
        return r2;
    }

    /**
     * Set a new value for the first resistance
     * @param resistance the new resistance
     */
    public void setR1(int resistance)
    {
        r1 = resistance;
    }

    /**
     * Set a new value for the second resistance
     * @param resistance the new resistance
     */
    public void setR2(int resistance)
    {
        r2 = resistance;
    }

    /**
     * Gets the gain for this amplifier circuit
     * @return the gain
     */
    public double getGain()
    {
        return 0;
    }
}