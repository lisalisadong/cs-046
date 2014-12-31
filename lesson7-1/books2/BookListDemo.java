package books2;

import java.util.ArrayList;
public class BookListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> booksToRead = new ArrayList<String>();

        booksToRead.add("The Eyre Affair by Jasper Fforde");
        booksToRead.add("Night Watch by Terry Pratchett");
        booksToRead.add("Next by Michael Crichton");
        booksToRead.add("The Brain That Changes Itself by Norman Doidge");
        booksToRead.add("Effective Java by Joshua Bloch");
        booksToRead.add("The Visual Display of Quantitative Information by Edward R. Tufte");

        String anotherBook = "Why zebras don't get ulcers by Robert M. Sapolsky";
        booksToRead.add(2, anotherBook);

        String sequel = "Lost in a Good Book by Jasper Fforde";
        // YOUR CODE HERE
        // Replace The Eyre Affair with
        // Lost in a Good Book
        // you can use the variable sequel that I defined above.
        booksToRead.set(0, sequel);

        // Please don't modify the following line:
        System.out.println(booksToRead);
    }
}