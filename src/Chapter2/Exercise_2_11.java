package src.Chapter2;

import java.util.Scanner;

public class Exercise_2_11 {
    public static void main(String[] args) {
        final long currentPopulation = 312_032_486;
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        final long noOfYears = scanner.nextLong();
        scanner.close();
        final long totalBirthsPerYear = (365 * 24 * 3600 / 7);
        final long totalDeathPerYer = (365 * 24 * 3600 / 13);
        final long totalImmigrantsPerYear = (365 * 24 * 3600 / 45);
        final long totalAdditionPerYear = totalBirthsPerYear + totalImmigrantsPerYear - totalDeathPerYer;

        final long newPopulation = currentPopulation + (noOfYears * totalAdditionPerYear);
        System.out.println("The population in " + noOfYears + " is " + newPopulation);

    }
}
