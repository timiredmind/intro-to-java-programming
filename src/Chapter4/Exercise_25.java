package src.Chapter4;

public class Exercise_25 {
    public static void main(String[] args) {
        StringBuilder plateNumber = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            plateNumber.append((char) ((Math.random() * 26) + 'A'));
        }
        for (int i = 0; i < 4; i++) {
            plateNumber.append((int)(Math.random() * 9));
        }
        System.out.println(plateNumber);
    }
}
