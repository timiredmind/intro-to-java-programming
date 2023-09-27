package src.Chapter3;

import java.util.Random;

/**
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centred at (0, 0) with width 50 and height 150.
 * **/
public class Exercise_3_16 {
    public static void main(String[] args) {
        final Random random = new Random();

        final int width = random.nextInt(0, 50 + 1);
        final int height = random.nextInt(0, 150 + 1);
        System.out.println("(" + width + ", " + height + ")");
    }
}
