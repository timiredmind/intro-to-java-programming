package src.Chapter5;

/**
 *  Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
 * table is given in Appendix B. Characters are separated by exactly one space.
 **/

public class Exercise_15 {
    public static void main(String[] args) {
        int start = 33;
        final int end = 126;
        int count = 1;

        while (start <= end) {
            System.out.print( (char) start);
            if (count == 10) {
                System.out.println();
                count = 1;
            } else {
                System.out.print(" ");
                count++;
            }
            start++;
        }

    }
}
