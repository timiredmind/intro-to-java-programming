package src.Chapter2;
/*
*Write a program that reads a number in meters,
* converts it to feet, and displays the result.
* One meter is 3.2786 feet
* */

import java.util.Scanner;

public class Exercise_2_03 {
    public static void main(String[] args) {
        final double FEETPERMETER = 3.2786;
        final Scanner input = new Scanner(System.in);

        final double meters = input.nextDouble();
        input.close();

        System.out.println("Enter a value for meter: ");
        final double feet = meters * FEETPERMETER;
        System.out.println(meters + " meters is " + feet + " feet");
    }
}
