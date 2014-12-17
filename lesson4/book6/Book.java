package book6;

// BlueJ Project: lesson4/book6
// Video: Working with the Book Text

import java.util.Scanner;
import java.io.File;

public class Book
{
    private String bookText;

    public Book(String fileName)
    {
        readBook(fileName);
    }

    /**
        Counts how many times a given word occurs in this book.
        @param word a word of length >= 1
        @return the number of occurrences
    */
    public int occurrencesOf(String word)
    {
        // TODO: Complete this method
    	return (bookText.length() - bookText.replace(word, "").length()) / word.length();
    }

    /**
        Counts how many times "Alice" occurs in this book.
        @return the number of occurrences
    */
    public int occurrencesOfAlice()
    {
        int length = bookText.length();
        int lengthWithoutAlice = bookText.replace("Alice", "").length();
        return (length - lengthWithoutAlice) / 5;
    }


    /**
       Gets the first sentence of this book.
       @return the first sentence (including the period) of this book.
    */
    public String getFirstSentence()
    {
        int endOfSentence = bookText.indexOf(".");
        return bookText.substring(0, endOfSentence + 1);
    }

    /**
       Gets the second sentence of this book.
       @return the second sentence (including the period) of this book.
    */
    public String getSecondSentence()
    {
        int beginningOfSentence = bookText.indexOf(".") + 1;
        int endOfSentence = bookText.indexOf(".", beginningOfSentence);
        return bookText.substring(beginningOfSentence, endOfSentence + 1);
    }

    /**
     * Calculates the number of characters (as in letters and
     * symbols, not people) in the book.
     * @return the number of letters and symbols in the book.
     */
    public int getNumCharacters()
    {
        return bookText.length();
    }

    /**
       Finds where the string "Mad Hatter" occurs for the first time in the book.
       @return the location of the first occurrence of the string
    */
    public int firstOccurrenceOfMadHatter()
    {
        return bookText.indexOf("Mad Hatter");
    }

    /**
     * A method to help read the book out of the file.
     * You don't have to read this unless you want to.
     * the "try" and "catch" are java's way of dealing with
     * runtime errors or "exceptions".
     */
    public void readBook(String fileName)
    {
        bookText = "";
        try
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                bookText += line + "\n";
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}