package src.Chapter4;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        final int noOfSide = scanner.nextInt();
        System.out.println("Enter the length of each side: ");
        final double lengthOfSide = scanner.nextDouble();
        scanner.close();

        final double area = (noOfSide * lengthOfSide * lengthOfSide)
                / (4 * Math.tan(Math.PI/ noOfSide));

        System.out.println("The area of the polygon is " + area);
    }
}
