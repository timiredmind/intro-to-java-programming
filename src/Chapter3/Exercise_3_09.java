package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_09 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        final int firstNineDigits = scanner.nextInt();
        scanner.close();

        int digits = firstNineDigits;

        int d1 = digits / (int) Math.pow(10, 8);
        digits %= Math.pow(10, 8);
        int d2 = digits / (int) Math.pow(10, 7);
        digits %= Math.pow(10, 7);
        int d3 = digits / (int) Math.pow(10, 6);
        digits %= Math.pow(10, 6);
        int d4 = digits / (int) Math.pow(10, 5);
        digits %= Math.pow(10, 5);
        int d5 = digits / (int) Math.pow(10, 4);
        digits %= Math.pow(10, 4);
        int d6 = digits / (int) Math.pow(10, 3);
        digits %= Math.pow(10, 3);
        int d7 = digits / (int) Math.pow(10, 2);
        digits %= Math.pow(10, 2);
        int d8 = digits / (int) Math.pow(10, 1);
        digits %= Math.pow(10, 1);
        int d9 = digits;

        int checksum =
                (d1 + (d2 * 2) + (d3 * 3) + (d4 * 4)
                        + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

        String d10;
        if (checksum == 10) {
            d10 = "X";
        } else {
            d10 = String.valueOf(checksum);
        }

        System.out.println(String.valueOf(d1) + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
}
