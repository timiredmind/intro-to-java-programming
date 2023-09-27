package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_28 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
//        1 2 3 5.5


        System.out.println("Enter r2’s center x-, y-coordinates, width, and height:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();

        scanner.close();

        double right1 = x1 + w1 / 2;
        double left1 = x1 - w1 / 2;

        double top1 = y1 + h1 / 2;
        double bottom1 = y1 - h1 / 2;

        double right2 = x2 + w2 / 2;
        double left2 = x2 - w2 / 2;

        double top2 = y2 + h2 / 2;
        double bottom2 = y2 - h2 / 2;

        if (right1 >= right2
                && left1 <= left2
                && top1 >= top2
                && bottom1 <= bottom2) {
            System.out.println("r2 is inside r1");
        } else if (left1 < right2 && right1 > left2 && top1 > bottom2 && bottom1 < top2) {
            System.out.println("r2 overlaps r1");

        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
