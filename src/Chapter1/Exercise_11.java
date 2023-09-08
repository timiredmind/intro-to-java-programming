package src.Chapter1;
/*
The U.S. Census Bureau projects population based on the
following assumptions:
One birth every 7 seconds
One death every 13 seconds
One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that
the current population is 312,032,486, and one year has 365 days
*/

public class Exercise_11 {
    static final int totalSecondsPerDay = 3600 * 24;
    static long currentPopulation = 312_032_486L;
    public static void main(String[] args) {
        final double noOfBirthsPerYear = calculateNoOfBirthsPerYear();
        final double noOfDeathsPerYear = calculateNoOfDeathsPerYear();
        final double noOfImmigrantsPerYear = calculateNoOfImmigrantsPerYear();
        final double populationAfterFirstYear =
                currentPopulation + noOfBirthsPerYear + noOfImmigrantsPerYear - noOfDeathsPerYear;
        final double populationAfterSecondYear =
                populationAfterFirstYear + noOfBirthsPerYear + noOfImmigrantsPerYear - noOfDeathsPerYear;
        final double populationAfterThirdYear =
                populationAfterSecondYear + noOfBirthsPerYear + noOfImmigrantsPerYear - noOfDeathsPerYear;
        final double populationAfterFourthYear =
                populationAfterThirdYear + noOfBirthsPerYear + noOfImmigrantsPerYear - noOfDeathsPerYear;
        final double populationAfterFifthYear =
                populationAfterFourthYear + noOfBirthsPerYear + noOfImmigrantsPerYear - noOfDeathsPerYear;

        System.out.println("After Year 1: " + populationAfterFirstYear);
        System.out.println("After Year 2: " + populationAfterSecondYear);
        System.out.println("After Year 3: " + populationAfterThirdYear);
        System.out.println("After Year 4: " + populationAfterFourthYear);
        System.out.println("After Year 5: " + populationAfterFifthYear);

    }

    private static Double calculateNoOfBirthsPerYear() {
        final double noOfBirthsPerDay = totalSecondsPerDay / 7.0;
        return noOfBirthsPerDay * 356;
    }

    private static Double calculateNoOfDeathsPerYear() {
        final double noOfDeathsPerDay = totalSecondsPerDay / 13.0;
        return noOfDeathsPerDay * 365;
    }

    private static  Double calculateNoOfImmigrantsPerYear() {
        final double noOfImmigrantsPerDay = totalSecondsPerDay /45.0;
        return noOfImmigrantsPerDay * 365;
    }
}
