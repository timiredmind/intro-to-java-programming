package src.Chapter5;
import java.util.Scanner;
/**
 * The monthly payment for a given
 * loan pays the principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal
 * paid for the month is therefore the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount, number of years, and interest
 * rate then displays the amortization schedule for the loan.
 * **/

public class Exercise_22 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();

        scanner.close();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = calculateMonthlyPayment(
                loanAmount,
                monthlyInterestRate,
                numberOfYears);

        double totalPayment = calculateTotalPayment(monthlyPayment, numberOfYears);

        System.out.printf("Monthly Payment: %.2f \n", monthlyPayment);
        System.out.printf("Total Payment: %.2f \n", totalPayment);

        System.out.println("Payment#\t Interest\t Principal\t Balance");
        int numberOfMonths = numberOfYears * 12;
        for (int n = 1; n <= numberOfMonths ; n++) {
            double interest = calculateMonthlyInterest(loanAmount, annualInterestRate);
            double principal = monthlyPayment - interest;
            loanAmount -= principal;

            System.out.printf("\t%d \t\t %.2f \t\t %.2f \t %.2f\n", n, interest, principal, loanAmount);
        }

    }

    private static double calculateMonthlyInterest(final double balance, final double interestRate) {
        return (balance * interestRate) / 1200;
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
