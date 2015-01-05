package mathToJava;

// BlueJ project: lesson8/turningMathToJava

// TODO: Convert the following methods to static methods
public class MathInJava
{
    /*
       Computes the fraction
       
           1
      -----------
           1 - s
       s + -----
             n
             
      See http://en.wikipedia.org/wiki/Amdahl%27s_law       
    */
    
    public static double amdahlSpeedup(double s, double n)
    {
        return 1 / (s + (1 - s) / n);
    }

    /*
        Computes the fraction
        
        (a - c)(b - d)
        --------------
        (b - c)(a - d)
        
        See http://en.wikipedia.org/wiki/Cross-ratio
    */
    
    public static double crossRatio(double a, double b, double c, double d)
    {
        return (a - c) * (b - d) / ((b - c) * (a - d));
    }

    /**
        Computes the average of four values.
        @param a the first value
        @param b the second value
        @param c the third value
        @param d the fourth value
        @return the average of the four values
    */
    
    public static double average(int a, int b, int c, int d)
    {
        return (a + b + c + d) / 4.0;
    }
}