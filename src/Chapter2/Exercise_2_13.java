package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_13 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double interestRate =  0.003125;
        System.out.println("Enter monthly saving amount: ");
        final double amount = scanner.nextDouble();
        scanner.close();

        final double firstMonthAmount = amount * (1 + interestRate);
        final double secondMonthAmount = (firstMonthAmount + amount) * (1 + interestRate);
        final double thirdMonthAmount = (secondMonthAmount + amount) * (1 + interestRate);
        final double forthMonthAmount = (thirdMonthAmount + amount) * (1 + interestRate);
        final double fifthMonthAmount = (forthMonthAmount + amount) * (1 + interestRate);
        final double sixthMonthAmount = (fifthMonthAmount + amount) * (1 + interestRate);

        System.out.println("After the first month, the account value is " + firstMonthAmount);
        System.out.println("After the second month, the account value is " + secondMonthAmount);
        System.out.println("After the third month, the account value is " + thirdMonthAmount);
        System.out.println("After the fourth month, the account value is " + forthMonthAmount);
        System.out.println("After the fifth month, the account value is " + fifthMonthAmount);
        System.out.println("After the sixth month, the account value is " + sixthMonthAmount);
    }
}
