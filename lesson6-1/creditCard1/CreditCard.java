package creditCard1;

// Bluej project: lesson6/credit_card1
// Video: Sum Every Other Digit

// TODO: Implement the sumCertainDigits method.
public class CreditCard
{
    private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates the sum of ever other digit in cardNumber 
     * starting from the rightmost digit.
     * @return the sum of every other digit starting from the rightmost.
     */
    public int sumCertainDigits()
    {
        // So that we don't accidentally change the credit card number,
        // make a copy called n. 
        long n = cardNumber;
        
        // TODO this is the code from the a previous video. You can use it
        // as a starting point, but you will need to change a lot.
        // Change this method so that it will calculate the sum of every
        // second digit instead of all the digits, and then return this 
        // special sum. 
        // for example, if n is 12345, this method should return the sum 
        // 5 + 3 + 1
        // There are links to videos with hints above the submit button. 
        // Use them if you want more inspiration.
        int sum = 0;
        int count = 0;
        while (n > 0)
        {             
            if (count % 2 == 0)
            {
            	int digit = (int)(n % 10);
            	sum = sum + digit;
            }
            n = n/10;
        	count ++;
        }
        return sum;
    }
}