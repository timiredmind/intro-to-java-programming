package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that
 * reads in investment amount, annual interest rate, and number of years and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)
 * numberOfYears*12
 * **/
public class Exercise_2_21 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the investment amount: ");
        final double amount = scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        final double interestRate = scanner.nextDouble();
        System.out.println("Enter number of years: ");
        final int noOfYears = scanner.nextInt();

        double futureInvestmentValue = amount * Math.pow(1 + (interestRate/1200), noOfYears * 12);
        System.out.println("Future value is " + futureInvestmentValue);

    }
}
