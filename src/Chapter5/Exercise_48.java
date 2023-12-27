package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string and displays the characters at even
 * positions. Here is a sample run
 **/

public class Exercise_48 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        String characters = "";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 1) {
                if (input.charAt(i) != ' ') {
                    characters += input.charAt(i);
                }
            }
        }
        System.out.println(characters);
    }
}
