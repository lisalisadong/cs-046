package mystery;

public class Casts
{
	public static void main(String[] args)
	{
		double price = 4.35;
		int pennies = (int) Math.round(price * 100);
		System.out.println(pennies);
	}
}