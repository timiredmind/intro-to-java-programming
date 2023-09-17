package src.Chapter2;

import java.util.Scanner;

/**
 * Write a program that converts square meter into ping.
 * The program prompts the user to enter a number in square meter, converts it to ping,
 * and displays the result. One square meter is 0.3025 ping.
 * **/
public class Exercise_2_04 {
    public static void main(String[] args) {
        final double SQMETER_TO_PING = 0.3025;
        final Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in square meters: ");
        final double value = input.nextDouble();
        input.close();
        final double result = value * SQMETER_TO_PING;

        System.out.println(value + " square meters is " + result + " pings");
    }
}
