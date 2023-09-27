package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that reads three edges for a
 * triangle and computes the perimeter if the input is valid. Otherwise, display that the
 * input is invalid. The input is valid if the sum of every pair of two edges is greater
 * than the remaining edge
 * **/

public class Exercise_3_19 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter edge 1 of the triangle: ");
        final double edge1 = scanner.nextDouble();
        System.out.println("Enter edge 2 of the triangle: ");
        final double edge2 = scanner.nextDouble();
        System.out.println("Enter edge 3 of the triangle: ");
        final double edge3 = scanner.nextDouble();

        scanner.close();

        if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1) {
            System.out.println("The inputs are invalid");
        } else {
            final double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is " + perimeter);
        }

    }
}
