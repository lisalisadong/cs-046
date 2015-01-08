package interfaceCreditCard;

import java.util.Arrays;
public class CreditCardPrinter
{
   public static void main(String[] args)
   {
       Comparable[] cards = { new CreditCard(1000),
                              new CreditCard(500),
                              new CreditCard(500),
                              new CreditCard(2000),
                              new CreditCard(300)
                            };
       Arrays.sort(cards);

       for (Comparable c : cards)
       {
           CreditCard card = (CreditCard)c;
           System.out.println(card.getBalance());
       }
   }
}