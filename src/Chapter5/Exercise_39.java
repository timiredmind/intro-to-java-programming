package src.Chapter5;

public class Exercise_39 {
    public static void main(String[] args) {
        double commission;
        double salesAmount = 0.00;
        do {
            salesAmount += 0.01;

            if (salesAmount >= 10_000.01) {
                commission = 700 + (salesAmount - 10_000) * 0.1;
            } else if (salesAmount >= 5_000.01) {
                commission = 300 + (salesAmount - 5_000) * 0.08;
            } else {
                commission = salesAmount * 0.06;
            }
        } while (commission < 25_000);

        System.out.println(
                "The minimum sale to generate $30,000 with the base salary as $5,000 is $" + (int) salesAmount);
    }
}
