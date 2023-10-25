package src.Chapter4;
/**
 * Write a program that displays a random lowercase letter using
 * the Math.random() method
 * */

public class Exercise_14 {
    public static void main(String[] args) {
        final int randomInt = (int) (Math.random() * 26);
        final char randomLetter = (char) ('a' + randomInt);
        System.out.println(randomLetter);

    }
}
