package src.Chapter5;

import java.util.Scanner;

public class Exercise_36 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String firstNineDigits = scanner.next();
        scanner.close();
        long digits = Long.parseLong(firstNineDigits);

        long total = 0;

        for (int i = 1; i <= 9; i++) {
            long number = digits / (int) Math.pow(10, 9 - i);
            total += (number * i);
            digits %=  (int) Math.pow(10, 9 - i);
        }

        long d10 = total % 11;
        String d10Value = d10 == 10 ? "X": String.valueOf(d10);
        String isbnValue = firstNineDigits + d10Value;
        System.out.println("The ISBN-10 number is " + isbnValue);
    }
}
