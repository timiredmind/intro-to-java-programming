package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that lets the user enter the loan amount and loan period in number of years and
 * displays the monthly and total payments for each interest rate starting from 5% to 10%, with an
 * increment of 1/4.
 **/

public class Exercise_21 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = scanner.nextInt();

        scanner.close();

        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        for (double annualInterestRate = 5; annualInterestRate <= 10; annualInterestRate += 0.25) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment =
                    calculateMonthlyPayment(loanAmount, monthlyInterestRate, numberOfYears);
            double totalPayment =
                    calculateTotalPayment(monthlyPayment, numberOfYears);

            System.out.printf("\t%.03f%% \t\t\t %.2f \t\t\t %.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }

    }

    private static double calculateMonthlyPayment(
            double loanAmount,
            double monthlyInterestRate,
            int numberOfYears) {
        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

    private static double calculateTotalPayment(double monthlyPayment, double numberOfYears) {
        return numberOfYears * monthlyPayment * 12;
    }
}
