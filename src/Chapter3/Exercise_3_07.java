package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_07 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount in double: ");
        final double amount = scanner.nextDouble();
        scanner.close();

        int remainingAmount = (int) (amount * 100);

        final int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        final int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        final int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        final int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        if (numberOfDollars == 1) {
            System.out.println("1 dollar");
        } else if (numberOfDollars > 1) {
            System.out.println(numberOfDollars + " dollars");
        }

        if (numberOfQuarters == 1) {
            System.out.println("1 quarter");
        } else if (numberOfQuarters > 1) {
            System.out.println(numberOfQuarters + " quarters ");
        }

        if (numberOfDimes == 1) {
            System.out.println("1 dime");
        } else if (numberOfDimes > 1) {
            System.out.println(numberOfDimes + " dimes ");
        }

        if (numberOfNickels == 1) {
            System.out.println("1 nickel");
        }

        if (remainingAmount == 1) {
            System.out.println("1 cent");
        } else if (remainingAmount > 1) {
            System.out.println(remainingAmount + " cents");
        }


    }
}
