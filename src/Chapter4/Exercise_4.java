package src.Chapter4;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side: ");
        final double side = scanner.nextDouble();
        scanner.close();

        final double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
