package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter 10 numbers and displays the mean
 * and standard deviations of these numbers using the following formula
 * **/

public class Exercise_45 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        double total = 0;
        double squareSum = 0;

        System.out.print("Enter 10 numbers: ");
        double number;
        for (int i = 1; i <= 10; i++) {
            number = scanner.nextDouble();
            total += number;
            squareSum += Math.pow(number, 2);
        }

        scanner.close();
        double mean = total / 10.0;
        double standardDeviation = calculateStandardDeviation(squareSum, total, 10);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + standardDeviation);
    }

    private static double calculateStandardDeviation(double squareSum, double total, double n) {
        return Math.sqrt((squareSum - (Math.pow(total, 2) / n)) / (n - 1));
    }

}
