package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_03 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();
        final double c = scanner.nextDouble();
        final double d = scanner.nextDouble();
        final double e = scanner.nextDouble();
        final double f = scanner.nextDouble();
        scanner.close();
        if ((a * d) - (b * c) == 0) {
            System.out.println("The equation has no solution");
        } else {
            final double x = ((e * d) + (b * f) )/ ((a * d) + (b - c));
            final double y = ((a * f) - (e * c)) / ((a * d) + (b - c));
            System.out.println("x is " + x + " y is " + y);
        }
    }
}
