package src.Chapter2;

import java.util.Scanner;
/**
 * Write a program that prompts the user to enter the
 * side of a hexagon and displays its area
 * **/
public class Exercise_2_16 {
    public static void main(String[] args) {
       final Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the length of the side: ");
       final double side = scanner.nextDouble();

       scanner.close();

       // calculate the area of the hexagon
        final double area = (3*Math.sqrt(3))/2 * side * side;

        System.out.println("The area of the hexagon is " + area);
    }
}
