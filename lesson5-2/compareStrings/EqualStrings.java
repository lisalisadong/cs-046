package compareStrings;

public class EqualStrings
{
    public static void main(String[] args)
    {
        String first = "Uda";
        String second = "city";
        String firstAndSecond = first + second;
        String third = "Udacity";
        if (firstAndSecond.equals(third))//instead of firstAndSecond == third
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("firstAndSecond is "
                               + firstAndSecond);
        }
        String statement = null;
        if (statement == null)
        {
        	System.out.println("fgdfstggh");
        }
    }
}