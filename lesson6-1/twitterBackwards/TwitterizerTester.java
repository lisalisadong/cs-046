package twitterBackwards;

public class TwitterizerTester
{
    public static void main(String[] args)
    {
        Twitterizer twitterizer = new Twitterizer();
        String post1 = "How did I ever program without loops?!";

        System.out.println("Actual: " + twitterizer.reverse(post1));
        System.out.println("Expected: !?spool tuohtiw margorp reve I did woH");

        String post2 = "That's so backwards!";

        System.out.println("Actual: " + twitterizer.reverse(post2));
        System.out.println("Expected: !sdrawkcab os s'tahT");
    }
}