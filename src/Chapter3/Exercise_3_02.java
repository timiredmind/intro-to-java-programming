package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_02 {
    public static void main(String[] args) {
        final long number1 = System.currentTimeMillis() % 10;
        final long number2 = System.currentTimeMillis() / 10 % 10;
        final long number3 = System.currentTimeMillis() / 1000 % 10;

        final Scanner scanner = new Scanner(System.in);
        System.out.println(
                "What is " + number1 + " * " + number2 + " * " + number3 + "?");

        long answer = scanner.nextLong();
        scanner.close();
        System.out.println(
                number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " +
                        (number1 * number2 * number3 == answer)
        );
    }
}
