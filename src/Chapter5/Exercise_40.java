package src.Chapter5;

import java.util.Random;

/**
 * Write a program that simulates flipping a coin two
 * millions times and displays the number of heads and tails.
 **/

public class Exercise_40 {
    public static void main(String[] args) {
        long headCount = 0;
        long tailCount = 0;
        Random random = new Random();
        for (int i = 1; i <= 2_000_000; i++) {
            int toss = random.nextInt(0, 2);

            if (toss == 0) {
                headCount++;
            } else {
                tailCount++;
            }
        }

        System.out.println(
                "After 2 million times the number of heads is " +
                        headCount + " and the number of tail is " +
                        tailCount);
    }
}
