package src.Chapter4;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        final double length = scanner.nextDouble();
        scanner.close();
        final double sideOfLength = 2 * length * Math.sin(Math.PI/5);
        final double areaOfPentagon =
                (5 * sideOfLength * sideOfLength) / (4 * Math.tan(Math.PI/5));

        System.out.printf("The area of the pentagon is %.2f", areaOfPentagon);
    }
}
