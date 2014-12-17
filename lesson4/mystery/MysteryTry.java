package mystery;

public class MysteryTry
{
	public static void main(String[] args)
	{
		int oneMillion = 1000000;
		int mystery = oneMillion * oneMillion;
		System.out.println(mystery); //Overflow 2,147,483,647
	}
}