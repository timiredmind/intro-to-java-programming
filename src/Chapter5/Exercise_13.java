package src.Chapter5;
/**
 * Use a while loop to find the largest
 * integer n such that n2 is less than 12,000
 * **/

public class Exercise_13 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n, 2) < 12_000) {
            n++;
        }

        System.out.println("The largest integer such that n ^ 2 is less than 12,000 is " + n);

    }
}
