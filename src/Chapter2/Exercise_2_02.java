package src.Chapter2;

import java.util.Scanner;

/* Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume
*/
public class Exercise_2_02 {
    public static void main(String[] args) {
        double area;
        double volume;
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equivalent triangle: ");
        final double lengthOfSide = input.nextDouble();
        input.close();
        area = (Math.sqrt(3) / 4) * lengthOfSide * lengthOfSide;
        volume = area * lengthOfSide;

        System.out.println("The area is: " + area);
        System.out.println("The volume of the triangle prism is : " + volume);
    }
}
