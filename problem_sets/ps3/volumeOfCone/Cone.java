package ps3.volumeOfCone;

//
// Complete the code to find the volume of a cone with radius r and height h.
//Use Math.PI
//
public class Cone
{
   private int r;
   private int h;

   /**
    * Constructor for the Cone class
    * @param r, the radius of the cone
    * @param h, the height of the cone
   */
   public Cone(int r, int h)
   {
      this.r = r;
      this.h = h;
   }
   
   /**
    * Returns the volume of a cone
    * Volume of a cone = 1/3 * PI * r^2 * h
    */
   public double getVolume()
   {
       double volume;
       // TODO write the code to assign the volume of the cone to the variable volume. Use Math.PI
       volume = Math.PI * Math.pow(r, 2) * h / 3;
       return volume;
   }
}