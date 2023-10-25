package src.Chapter4;

import java.util.Scanner;

/**
 * Write a program that reads the following information
 * and prints a payroll statement:
 * */
public class Exercise_23 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee’s name: ");
        String employeeName = scanner.next();
        System.out.println("Enter number of hours worked in a week: ");
        int noOfHours = scanner.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxRate = scanner.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxRate = scanner.nextDouble();
        scanner.close();

        System.out.printf("Employee name: %s\n", employeeName);
        System.out.printf("Hours Worked: %d\n", noOfHours);
        System.out.printf("Pay Rate: $%.2f\n", hourlyRate);
        double grossPay = hourlyRate * noOfHours;
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deduction: ");
        double federalTax = (federalTaxRate * grossPay);
        federalTaxRate *=  100;
        System.out.printf("\t Federal Withholding (%.2f%%): $%.2f\n", federalTaxRate, federalTax);
        double stateTax = stateTaxRate * grossPay;
        stateTaxRate *= 100;
        System.out.printf("\t State Withholding (%.2f%%) : $%.2f\n", stateTaxRate, stateTax);
        double totalDeduction = stateTax + federalTax;
        System.out.printf("\t Total Deduction: $%.2f\n", totalDeduction);
        double netPay = grossPay - totalDeduction;
        System.out.printf("Net Pay : $%.2f", netPay);


    }
}
