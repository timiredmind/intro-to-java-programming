package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that receives a character
 * and displays its ASCII code (an integer between 0 and 127)
 * **/

public class Exercise_08 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char userInput = scanner.next().charAt(0);
        scanner.close();

        System.out.printf("The ASCII code for character %c is %d", userInput, (int) userInput);
    }
}
