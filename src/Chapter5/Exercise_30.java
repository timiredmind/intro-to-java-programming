package src.Chapter5;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the saving amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the number of months: ");
        int numberOfMonths = scanner.nextInt();
        double totalAmount = 0;

        scanner.close();

        final double monthlyInterestRate = interestRate / 1200;

        for (int month = 1; month <= numberOfMonths; month++) {
            totalAmount = (amount + totalAmount) * (1 + monthlyInterestRate);
        }
        System.out.printf(
                "The total amount in the saving amount after %s is %.3f", numberOfMonths, totalAmount);
    }
}
