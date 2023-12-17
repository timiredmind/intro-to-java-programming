package src.Chapter5;

import java.util.Scanner;

/**
 *  Write a program that prompts the user to enter a decimal
 * integer then displays its corresponding binary value. Don’t use Java’s Integer
 * .toBinaryString(int) in this program.
 * **/

public class Exercise_37 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimalInteger = scanner.nextInt();
        scanner.close();

        String binaryValue = convertDecimalToBinary(decimalInteger);

        System.out.println(
                "The decimal integer " + decimalInteger +
                        " when converted to binary is " + binaryValue);
    }

    private static String convertDecimalToBinary(int decimalValue) {
        final StringBuilder string = new StringBuilder();
        while(decimalValue > 0) {
            string.append(decimalValue % 2);
            decimalValue /= 2;
        }
        return string.reverse().toString();
    }
}
