package src.Chapter4;

import java.util.Scanner;

public class Exercise_19 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN : ");
        final String firstNineISBNDigits = scanner.next();
        scanner.close();
        int checkSum = 0;
        for (int i = 1; i <= 9; i++) {
            int value = firstNineISBNDigits.charAt(i-1) - '0';
            checkSum += (value * i);
        }

        String d10 = (checkSum % 11) == 10 ? "X" : String.valueOf(checkSum % 11);
        System.out.println("The ISBN-10 number is " + firstNineISBNDigits + d10);

    }
}
