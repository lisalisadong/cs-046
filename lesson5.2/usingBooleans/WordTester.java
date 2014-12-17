package usingBooleans;

public class WordTester
{
    public static void main(String[] args)
    {
        Word udacity = new Word("Udacity");
        Word hello = new Word("hello");

        System.out.println(udacity.isVowel(0));
        System.out.println("Expected: true");
        System.out.println(udacity.isVowel(1));
        System.out.println("Expected: false");
        System.out.println(hello.isVowel(2));
        System.out.println("Expected: false");
        System.out.println(hello.isVowel(4));
        System.out.println("Expected: true");

        System.out.println(udacity.isConsonant(0));
        System.out.println("Expected: false");
        System.out.println(udacity.isConsonant(1));
        System.out.println("Expected: true");
        System.out.println(hello.isConsonant(2));
        System.out.println("Expected: true");
        System.out.println(hello.isConsonant(4));
        System.out.println("Expected: false");
    }
}