package src.Chapter5;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer.
 * toOctalString(int) in this program.
 * **/
public class Exercise_38 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal integer: ");
        int decimalInteger = scanner.nextInt();
        scanner.close();

        String octalValue = convertDecimalToOctal(decimalInteger);
        System.out.println(
                "The decimal integer " + decimalInteger +
                        " when converted to octal is " + octalValue
                          );
    }

    private static String convertDecimalToOctal(int value) {
        final StringBuilder string = new StringBuilder();
        while (value > 0) {
            string.append(value % 8);
            value /= 8;
        }
        return string.reverse().toString();
    }
}
