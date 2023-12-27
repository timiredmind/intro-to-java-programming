package src.Chapter5;

import java.util.Scanner;

/**
 * (Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels. Write a
 * program that prompts the user to enter a string, and displays the number of vowels and consonants
 * in the string.
 **/


public class Exercise_49 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine().toLowerCase();
        scanner.close();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'
                    || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'
            ) {
                vowelCount++;
            } else if (s.charAt(i) != ' ') {
                consonantCount++;
            }
        }

        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);
    }
}
