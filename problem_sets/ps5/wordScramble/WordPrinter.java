package ps5.wordScramble;

public class WordPrinter
{
  public static void main(String[] args)
  {
      Word myWord = new Word();
      for (int i = 1; i <= 10; i++)
      {
          System.out.println(myWord.scramble("Udacity"));
        }
  }
}