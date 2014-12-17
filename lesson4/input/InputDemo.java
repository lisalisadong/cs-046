package input;

import java.util.Scanner;

public class InputDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = in.nextInt();

        System.out.print("Next year, you will be ");
        System.out.println(age + 1);

        System.out.print("What is your weight? ");
        double weight = in.nextDouble();

        System.out.print("I hope next year that'll be ");
        System.out.print(weight * 0.95);
    }
}