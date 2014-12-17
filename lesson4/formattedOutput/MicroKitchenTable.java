package formattedOutput;

// BlueJ project: lesson4/formattedOutput
// Video: Formatted Output Practice Part 2

public class MicroKitchenTable
{
    public static void main(String[] args)
    {
        int saraCookiesPerDay = 3;
        double saraCerealPerDay = .06;
        String saraName = "Sara";
        int cayCookiesPerDay = 1;
        double cayCerealPerDay = 0;
        String cayName = "Cay";
        System.out.println("cookies | cereal | name");
        System.out.println("------------------------");

        // TODO: Print entries for Sara
        // Be sure to line up the entries in the columns using printf
        // Print floating-point numbers with two digits after the decimal point
        System.out.printf("%8d|%8.2f|%s\n", saraCookiesPerDay, saraCerealPerDay, saraName);

        // TODO: Print entries for Cay
        System.out.printf("%8d|%8.2f|%s\n", cayCookiesPerDay, cayCerealPerDay, cayName);
    }
}