package src.Chapter2;

/**
 * Write a program that displays the following table. Calculate the middle point of two points. a
 *    b       Middle Point
 *    (0, 0) (2, 1) (1.0, 0.5)
 *    (1, 4) (4, 2) (2.5, 3.0)
 *    (2, 7) (6, 3) (4.0,5.0)
 *    (3, 9) (10, 5) (6.5, 7.0)
 *    (4, 11) (12, 7) (8.0, 9.0)
 **/


public class Exercise_2_18 {
    public static void main(String[] args) {
        System.out.println("a          b       Middle Point");
        int x1, x2, y2, y1;
        x1 = 0;
        x2 = 2;
        y1 = 0;
        y2 = 1;

        System.out.printf("(%s, %s)  (%s, %s)    (%s, %s)%n", x1, y1, x2, y2,
                          calculateMiddlePoint(x1, x2), calculateMiddlePoint(y1, y2));

        x1 = 1;
        x2 = 4;
        y1 = 4;
        y2 = 2;

        System.out.printf("(%s, %s)  (%s, %s)    (%s, %s)%n", x1, y1, x2, y2,
                          calculateMiddlePoint(x1, x2), calculateMiddlePoint(y1, y2));

        x1 = 2;
        x2 = 6;
        y1 = 7;
        y2 = 3;

        System.out.printf("(%s, %s)  (%s, %s)    (%s, %s)%n", x1, y1, x2, y2,
                         calculateMiddlePoint(x1, x2), calculateMiddlePoint(y1, y2));

        x1 = 3;
        x2 = 10;
        y1 = 9;
        y2 = 5;

        System.out.printf("(%s, %s)  (%s, %s)    (%s, %s)%n", x1, y1, x2, y2,
                          calculateMiddlePoint(x1, x2), calculateMiddlePoint(y1, y2));

        // (4, 11) (12, 7) (8.0, 9.0)
        x1 = 4;
        x2 = 12;
        y1 = 11;
        y2 = 7;
        System.out.printf("(%s, %s)  (%s, %s)    (%s, %s)%n", x1, y1, x2, y2,
                          calculateMiddlePoint(x1, x2), calculateMiddlePoint(y1, y2));

    }

    public static double calculateMiddlePoint(final double value1, final double value2) {
        return (value1 + value2) / 2;
    }
}

