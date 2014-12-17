package book6;

public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("./predefined/txt/aliceInWonderland.txt");

        System.out.println(alice.occurrencesOf("Alice"));
        System.out.println("Expected: 395");

        System.out.println(alice.occurrencesOf("Mad Hatter"));
        System.out.println("Expected: 0");
    }
}