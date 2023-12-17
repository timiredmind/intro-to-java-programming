package src.Chapter5;

/**
 * Write a program that displays all the leap years, ten per line,
 * from 2014 to 2114, separated by exactly one space. Also display the number of
 * leap years in this period
 * **/
public class Exercise_27 {
    public static void main(String[] args) {
        final int startYear = 2014;
        final int endYear = 2114;
        int count = 0;

        for (int year = startYear; year <= endYear; year++) {
            if (isYearALeapYear(year)) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(year);
                } else {
                    System.out.print(year + " ");
                }
            }
        }

        System.out.println(
                "There are " + count + " leap years between " + startYear + " and " + endYear);

    }

    private static boolean isYearALeapYear(int year) {
            if (year % 400 == 0) {
                return true;
            }
        return year % 4 == 0 && year % 100 != 0;
    }
}
