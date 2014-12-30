package findingTheFirstMatch;

// Bluej project: finding_the_first_match
// Write a program that finds the first word in Alice In Wonderland
// that is longer than a given number of characters.

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("./predefined/txt/aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        final int THRESHOLD = 9;
        // TODO: Write a loop that searches for long words
        // (more than THRESHOLD letters)
        // The loop should stop if you find one or if you run out of words
        while (in.hasNext() && found == false)
        {
        	String word = in.next();
        	if (word.length() > THRESHOLD)
        	{
        		longWord = word;
        		found = true;       		
        	}
        }
        System.out.println("The first long word is: " + longWord);
    }
}