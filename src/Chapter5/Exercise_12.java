package src.Chapter5;
/**
 * Use a while loop to find the smallest
 * integer n such that n3 is greater than 12,000
 * **/

public class Exercise_12 {
    public static void main(String[] args) {
        int n = 1;

        while (Math.pow(n, 3) < 12_000) {
            n++;
        }

        System.out.println("The smallest integer such that n ^ 3 is greater than 12,000 is "
                                   + n);
    }
}
