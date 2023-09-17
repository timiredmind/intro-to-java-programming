package src.Chapter2;

import java.util.Scanner;

/**
 * If you know the balance and the annual
 * percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month

 * **/

public class Exercise_2_20 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        final double balance = scanner.nextDouble();
        final double annualInterestRate = scanner.nextDouble();

        scanner.close();
        double interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
