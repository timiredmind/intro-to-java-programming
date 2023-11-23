package src.Chapter4;

import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount in double, for example 11.56: ");
        String amount = scanner.next();

        final int pointIndex = amount.indexOf('.');
        if (pointIndex == -1) {
            System.exit(0);
        }
        final int numberOfOneDollar = Integer.parseInt(amount.substring(0, pointIndex));
        int remainingAmount = Integer.parseInt(amount.substring(pointIndex + 1));

        final int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        final int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        final int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        final int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollar + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");


    }
}
