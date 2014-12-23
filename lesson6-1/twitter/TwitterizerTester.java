package twitter;

public class TwitterizerTester
{
    public static void main(String[] args)
    {
        Twitterizer twitterizer = new Twitterizer();
        String longPost = "How did I ever program without loops?!";
        
        System.out.println("Actual " + twitterizer.shorten(longPost));
        System.out.println("Expected Hw dd  vr prgrm wtht lps?!");
        
        Twitterizer twitterizer2 = new Twitterizer();
        String longPost2 = "JAva is cOol. Don't yoU lovE It?";
        
        System.out.println("Actual " + twitterizer2.shorten(longPost2));
        System.out.println("Expected Jv s cl. Dn't y lv t?");
        
    }
}