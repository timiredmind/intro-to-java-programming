package src.Chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Suppose that the tuition for a university is $10,000 this year and increases 6% every year. In
 * one year, the tuition will be $10,600. Write a program that computes the tuition in ten years and
 * the total cost of four years’ worth of tuition after the tenth year
 **/
public class Exercise_07 {
    public static void main(String[] args) {
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double tuition = 10_000;
        final double interestRate = 0.06;
        double totalCost = 0;

        for (int year = 1; year <= 10; year++) {
            double interest = tuition * interestRate;
            tuition += interest;
        }

        System.out.println("Tuition fee in 10 years will be $ " +
                                   decimalFormat.format(tuition));

        totalCost += tuition;
        for (int year = 1; year <= 4; year++) {
            double interest = tuition * interestRate;
            tuition += interest;
            totalCost += tuition;
        }

        System.out.println("total cost of four years’ worth of tuition after the tenth year " +
                                   decimalFormat.format(totalCost));


    }
}
