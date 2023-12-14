package src.Chapter5;

import java.util.Scanner;
/**
 * Write a program that reads an integer and displays
 * all its smallest factors in an increasing order.
 * For example, if the input integer is 120,
 * the output should be as follows: 2, 2, 2, 3, 5
 * **/
class Exercise_16 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer: ");
        int input = scanner.nextInt();
        StringBuilder factors = new StringBuilder();
        int divisor = 2;
        String separator = "";

        while (input != 1) {
            if (input % divisor == 0) {
                input /= divisor;
                separator = input != 1 ? ", ": "";
                factors.append(String.format("%s%s", divisor, separator));
            }
            else divisor++;
        }

        System.out.println(factors);

    }
}