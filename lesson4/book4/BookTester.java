package book4;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("./predefined/txt/chapter1.txt");

        // The sentence is pretty long, but it is in a single line
        System.out.println(alice.getSecondSentence());
        System.out.println("Expected: So she was considering in her own mind (as well as she could, for the hot day made her feel very sleepy and stupid), whether the pleasure of making a daisy-chain would be worth the trouble of getting up and picking the daisies, when suddenly a White Rabbit with pink eyes ran close by her.");

        Book mary = new Book("./predefined/txt/mary.txt");

        // Here, the end-of-line markers are replaced with a space so that the actual and expected results fit on a line.
        System.out.println(mary.getSecondSentence().replace("\n", " "));
        System.out.println("Expected: And everywhere that Mary went, Mary went, Mary went, and everywhere that Mary went, the lamb was sure to go.");
    }
}