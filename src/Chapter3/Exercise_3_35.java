package src.Chapter3;

import java.util.Scanner;

/**
 *  Write a program that prompts the user to enter an integer and
 * displays whether the integer is an odd number or not
 * */

public class Exercise_3_35 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
