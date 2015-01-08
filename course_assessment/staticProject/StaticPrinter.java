package staticProject;

// There is a static method called getTip in the
// Finance class already written for you.
//
// You are to complete the statement double tip ...
// to call the static getTip method
// You can ignore the rest of the method.
// It gets a value from the user and prints
//
// DO NOT instantiate a Finance object. 
// You will get no credit for that. Call the method in a static manner
//

import java.util.Scanner;
public class StaticPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cost of the dinner: ");
        double cost = in.nextDouble();
        
        // TODO: call the static method getTip in the Finance class
        double tip = Finance.getTip(cost);
        System.out.printf("\n%.2f",tip);
    }
}