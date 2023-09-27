package src.Chapter3;

import java.util.Scanner;

public class Exercise_3_13 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or "
                     + "qualifying widow(er), 2-married separately, 3-head of "
                     + "household) Enter the filing status: ");


        int status = scanner.nextInt();
        System.out.println("Enter taxable income: ");
        double income = scanner.nextDouble();
    }
}
