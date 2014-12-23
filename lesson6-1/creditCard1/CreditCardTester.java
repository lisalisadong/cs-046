package creditCard1;

public class CreditCardTester
{
    public static void main(String[] args)
    {
        CreditCard card = new CreditCard(12345);
        System.out.println("Actual: " + card.sumCertainDigits());
        System.out.println("Expected: 9");

        CreditCard anotherCard = new CreditCard(135792);
        System.out.println("Actual: " + anotherCard.sumCertainDigits());
        System.out.println("Expected: 12");
    }
}