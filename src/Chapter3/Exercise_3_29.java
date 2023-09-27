package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the
 * center coordinates and radii of two circles and determines whether the second
 * circle is inside the first or overlaps with the first, as shown in Figure 3.10. (Hint:
 * circle2 is inside circle1 if the distance between the two centers 6 = r1 -
 * r2 and circle2 overlaps circle1 if the distance between the two centers 6 =
 * r1 + r2. Test your program to cover all cases
 * **/

public class Exercise_3_29 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle1’s center x-, y-coordinates, and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        System.out.println("Enter circle2’s center x-, y-coordinates, and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        scanner.close();

        double distanceBetweenCenters = Math.pow(Math.pow((x2 - x1), 2) + Math.pow(y2 -y1, 2), 0.5);
        if (distanceBetweenCenters <= r1 -r2) {
            System.out.println("circle 2 is inside circle 1");
        } else if (distanceBetweenCenters <= r1 + r2) {
            System.out.println("circle 2 overlaps circle 1");
        } else {
            System.out.println("circle 2 is outside circle 1");
        }
    }
}
