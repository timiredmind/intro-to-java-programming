package src.Chapter4;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        final double radius = scanner.nextDouble();
        scanner.close();

        double angleIncrement = Math.toRadians(360/5.0);

        final double angle1 = angleIncrement * 1;
        final double angle2 = angleIncrement * 2;
        final double angle3 = angleIncrement * 3;
        final double angle4 = angleIncrement * 4;
        final double angle5 = angleIncrement * 5;

        final double x1 = Math.cos(angle1) * radius;
        final double y1 = Math.sin(angle1) * radius;
        final double x2 = Math.cos(angle2) * radius;
        final double y2 = Math.sin(angle2) * radius;
        final double x3 = Math.cos(angle3) * radius;
        final double y3 = Math.sin(angle3) * radius;
        final double x4 = Math.sin(angle4) * radius;
        final double y4 = Math.sin(angle4) * radius;
        final double x5 = Math.sin(angle5) * radius;
        final double y5 = Math.sin(angle5) * radius;

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f) \n", x1, y1);
        System.out.printf("(%.2f, %.2f) \n", x2, y2);
        System.out.printf("(%.2f, %.2f) \n", x3, y3);
        System.out.printf("(%.2f, %.2f) \n", x4, y4);
        System.out.printf("(%.2f, %.2f) \n", x5, y5);
    }
}
