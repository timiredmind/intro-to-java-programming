package src.Chapter3;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 * **/

public class Exercise_3_08 {
    public static void main(String[] args) {
        final Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int thirdInteger = scanner.nextInt();

        scanner.close();

        int temp;

        if (firstInteger > secondInteger) {
            temp = firstInteger;
            firstInteger = secondInteger;
            secondInteger = temp;
        }

        if (secondInteger > thirdInteger) {
            temp = secondInteger;
            secondInteger = thirdInteger;
            thirdInteger = temp;
        }

        if (firstInteger > secondInteger) {
            temp = firstInteger;
            firstInteger = secondInteger;
            secondInteger = temp;
        }

        System.out.println("Integers in non-decreasing order: "
                                   + firstInteger + ", " +
                                   secondInteger + ", " +
                                   thirdInteger);

    }
}
