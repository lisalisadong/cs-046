package format;

public class FormatDemo
{
    public static void main(String[] args)
    {
        int quantity = 100;
        double unitPrice = 4.35;
        double totalPrice = quantity * unitPrice;

        System.out.print("Total: ");
        System.out.printf("%8.2f\n", totalPrice);

        double taxRate = 0.08;
        double tax = totalPrice * taxRate;

        System.out.print("Tax:   ");
        System.out.printf("%8.2f\n", tax);
    }
}