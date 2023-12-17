package src.Chapter5;

import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualYield = scanner.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = scanner.nextInt();

        scanner.close();

        double monthlyYield = annualYield / 1200;

        System.out.println("Month \t CD Value");
        for (int month = 1; month <= numberOfMonths; month++) {
            amount = amount * (1 + monthlyYield);
            System.out.printf("%-5s \t %.2f\n", month, amount);
        }
    }
}
