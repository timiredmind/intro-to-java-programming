package src.Chapter2;
/*
* Write a program that reads a mile in a double value
* from the console, converts it to kilometers, and displays the result.
* The formula for the conversion is as follows
* */

import java.util.Scanner;

public class Exercise_2_01 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        final double mile = input.nextDouble();
        input.close();
        final double kilometer = mile * 1.6;
        System.out.println(mile + " miles is equal to" + kilometer + " kilometer");
    }
}
