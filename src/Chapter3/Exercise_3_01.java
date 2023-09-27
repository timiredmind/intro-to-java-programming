package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root.
 * Otherwise, display “The equation has no real roots.”
 * **/
public class Exercise_3_01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();

        scanner.close();

        final double discriminant = calculateDiscriminant(a, b, c);
        if (discriminant < 0 ) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        } else {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
    }

    private static double calculateDiscriminant(
            final double a , final double b, final double c) {
        return (b * b) - (4 * a * c);
    }

}
