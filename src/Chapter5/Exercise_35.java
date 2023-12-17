package src.Chapter5;

public class Exercise_35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int num = 1; num < 999; num++) {
            double numerator = 1;
            double denominator = Math.sqrt(num) + Math.sqrt(num+1);
            sum += (numerator / denominator);
        }
        System.out.println("The summation is " + sum);
    }

}
