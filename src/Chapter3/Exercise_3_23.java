package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_23 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        final double pointX = scanner.nextDouble();
        final double pointY = scanner.nextDouble();
        scanner.close();

        if (pointX > 6 || pointY > 3.5 || pointX < -4 || pointY < -1.5) {
            System.out.println("Point (" + pointX + ", " + pointY + ") is not in the rectangle.");
        } else {
            System.out.println("Point (" + pointX + ", " + pointY + ") is in the rectangle.");

        }
    }
}
