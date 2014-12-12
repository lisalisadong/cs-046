package ps2.creditCard;

// You don't need to modify this class
public class CreditCardTester
{
   public static void main(String[] args)
   {
       CreditCard visa =new CreditCard();
       System.out.println(visa.getBalance());
       System.out.println("Expected: 0.0");
       
       visa.purchase(10.50);
       visa.purchase(2.99);
       System.out.println(visa.getBalance());
       System.out.println("Expected: 13.49");
       
       visa.payment(5.0);
       visa.payment(5);
       System.out.println(visa.getBalance());
       System.out.println("Expected: 3.49");
       
   }
}