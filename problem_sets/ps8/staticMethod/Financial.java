package ps8.staticMethod;

//
// This class needs a static method getTax which will return the tax on a purchase.
// The javadoc and method body are done for you. You are to write the method header.
// The method will be invoked without creating a Financial object
public class Financial
{
   /**
    * Gets the tax on the given amoiunt at the given tax rate
    * @param taxRate the tax rate as a decimal (eg .095)
    * @param amount the amount toc pay tax on
    * @return the tax on the given amount at the given tax rate.
    */

    // TODO: Complete the method header
   public static double getTax(double taxRate, double amount)
   {
       return taxRate * amount;
   }
}