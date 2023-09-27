package src.Chapter3;

import java.util.Random;

public class Exercise_3_24 {
    public static void main(String[] args) {
        final Random random = new Random();

        int rank = random.nextInt(1, 14);
        int suit = random.nextInt(1, 5);

        String rankString ;
        String suitString ;
        switch (rank) {
            case 1 -> rankString = "Ace";
            case 11 -> rankString = "Jack";
            case 12 -> rankString = "Queen";
            case 13 -> rankString = "King";
            default -> rankString = String.valueOf(rank);
        }

        if (suit == 1) {
            suitString = "Clubs";
        } else if (suit == 2) {
            suitString = "Diamonds";
        } else if (suit == 3) {
            suitString = "Hearts";
        } else {
            suitString = "Spades";
        }

        System.out.println("The card you picked is " + rankString + " of " + suitString);
    }
}
