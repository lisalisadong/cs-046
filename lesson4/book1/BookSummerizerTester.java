package book1;

public class BookSummerizerTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("./predefined/txt/aliceInWonderland.txt");
        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");

        Book mary = new Book("./predefined/txt/mary.txt");
        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
    }
}