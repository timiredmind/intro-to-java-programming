package src.Chapter2;

import java.util.Scanner;

/**
 * (Geometry: area of a triangle)
 * Write a program that prompts the user to enter three
 * points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area
 * **/
public class Exercise_2_19 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of three points separated by spaces"
                           + "like x1 y1 x2 y2 x3 y3: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        scanner.close();

        final double area = getArea(x1, y1, x2, y2, x3, y3);

        System.out.println("The area of the triangle is " + area);
    }

    private static double getArea(double x1, double y1, double x2, double y2, double x3,
                                  double y3) {
        final double side1 = Math.sqrt(Math.pow(x2 - x1, 2)  + Math.pow(y2 - y1, 2));
        final double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        final double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        final double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
