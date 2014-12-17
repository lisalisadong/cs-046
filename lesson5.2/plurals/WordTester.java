package plurals;

public class WordTester
{
    public static void main(String[] args)
    {
        System.out.println(new Word("kiss").getPluralForm());
        System.out.println("Expected: kisses");
        System.out.println(new Word("phase").getPluralForm());
        System.out.println("Expected: phases");
        System.out.println(new Word("dish").getPluralForm());
        System.out.println("Expected: dishes");
        System.out.println(new Word("massage").getPluralForm());
        System.out.println("Expected: massages");
        System.out.println(new Word("witch").getPluralForm());
        System.out.println("Expected: witches");
        System.out.println(new Word("judge").getPluralForm());
        System.out.println("Expected: judges");
        System.out.println(new Word("lap").getPluralForm());
        System.out.println("Expected: laps");
        System.out.println(new Word("cat").getPluralForm());
        System.out.println("Expected: cats");
        System.out.println(new Word("clock").getPluralForm());
        System.out.println("Expected: clocks");
        System.out.println(new Word("cuff").getPluralForm());
        System.out.println("Expected: cuffs");
        System.out.println(new Word("death").getPluralForm());
        System.out.println("Expected: deaths");
        System.out.println(new Word("boy").getPluralForm());
        System.out.println("Expected: boys");
        System.out.println(new Word("girl").getPluralForm());
        System.out.println("Expected: girls");
        System.out.println(new Word("chair").getPluralForm());
        System.out.println("Expected: chairs");
        System.out.println(new Word("day").getPluralForm());
        System.out.println("Expected: days");
        System.out.println(new Word("monkey").getPluralForm());
        System.out.println("Expected: monkeys");
        System.out.println(new Word("bath").getPluralForm());
        System.out.println("Expected: baths");
        System.out.println(new Word("cherry").getPluralForm());
        System.out.println("Expected: cherries");
        System.out.println(new Word("y").getPluralForm());
        System.out.println("Expected: ys");
        System.out.println(new Word("h").getPluralForm());
        System.out.println("Expected: hs");
    }
}