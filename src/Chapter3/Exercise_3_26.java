package src.Chapter3;

import java.util.Scanner;

/**
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 4 and 5, whether it is divisible
 * by 4 or 5, and whether it is divisible by 4 or 5 but not both. Here is a sample run of
 * this program
 * **/

public class Exercise_3_26 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean andDivisibility = number % 4 == 0 && number % 5 == 0;
        boolean orDivisibility = number % 4 == 0 || number % 5 == 0;
        boolean orExclusiveDivisibility = number % 4 == 0 ^ number % 5 == 0;

        System.out.println("Is 10 divisible by 4 and 5 ? " + andDivisibility);
        System.out.println("Is 10 divisible by 4 or 5 ? " + orDivisibility);
        System.out.println("Is 10 divisible by 4 or 5  but not both ? " + orExclusiveDivisibility);



    }
}
