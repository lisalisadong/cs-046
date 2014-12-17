// Mad Hatter search

package book2;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("./predefined/txt/aliceInWonderland.txt");

        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");

        Book code = new Book("./lesson4/book2/BookTester.java");
        System.out.println(code.firstOccurrenceOfMadHatter());
        System.out.println("Expected: 3");
    }
}