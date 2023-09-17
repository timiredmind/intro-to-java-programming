package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that reads the subtotal
 * and the gratuity rate and then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
 * as gratuity and $11.2 as total.
 * **/
public class Exercise_2_05 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        final double subtotal = scanner.nextDouble();
        final double gratuityRate = scanner.nextDouble();
        scanner.close();
        final double gratuity = subtotal * (gratuityRate/100.0);
        final double total = gratuity + subtotal;

        System.out.println("The gratuity is $" + gratuity + " total $" + total);
    }
}
