package src.Chapter4;

import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first country: ");
        String firstCountry = scanner.nextLine();
        System.out.println("Enter the second country: ");
        String secondCountry = scanner.nextLine();
        System.out.println("Enter the third country: ");
        String thirdCountry = scanner.nextLine();

        scanner.close();
        String firstOrder = "";
        String secondOrder = "";
        String thirdOrder = "";
        if (firstCountry.compareTo(secondCountry) > 0 && firstCountry.compareTo(thirdCountry) > 0) {
            firstOrder =  firstCountry;
            if (secondCountry.compareTo(thirdCountry) > 0) {
                secondOrder = secondCountry;
                thirdOrder = thirdCountry;
            } else {
                thirdOrder = secondCountry;
                secondOrder = thirdCountry;
            }
        } else if (secondCountry.compareTo(firstCountry) > 0 &&
                secondCountry.compareTo(thirdCountry) > 0) {
            firstOrder = secondCountry;
            if (firstCountry.compareTo(thirdCountry) > 0) {
                secondOrder = firstCountry;
                thirdOrder = thirdCountry;
            } else {
                secondOrder = thirdCountry;
                thirdOrder = firstCountry;
            }
        } else if (thirdCountry.compareTo(firstCountry) > 0 &&
                thirdCountry.compareTo(secondCountry) > 0) {
            firstOrder = thirdCountry;
            if (firstCountry.compareTo(secondCountry) > 0) {
                secondOrder = firstCountry;
                thirdOrder = secondCountry;
            } else {
                secondOrder = secondCountry;
                thirdOrder = firstCountry;
            }
        } else {
            firstOrder = firstCountry;
            secondOrder = secondCountry;
            thirdOrder = thirdCountry;
        }
        System.out.printf("The three countries in descending order are %s %s %s",
                          firstOrder, secondOrder, thirdOrder);
    }
}
