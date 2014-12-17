package book3;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("./predefined/txt/chapter1.txt");

        // The sentence is pretty long, but it is in a single line
        System.out.println(alice.getFirstSentence());
        System.out.println("Expected: Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'.");

        Book mary = new Book("./predefined/txt/mary.txt");

        // Here, the end-of-line markers are replaced with spaces so that the actual and expected results fit on a line.
        System.out.println(mary.getFirstSentence().replace("\n", " "));
        System.out.println("Expected: Mary had a little lamb, little lamb, little lamb, Mary had a little lamb, its fleece was white as snow.");
    }
}