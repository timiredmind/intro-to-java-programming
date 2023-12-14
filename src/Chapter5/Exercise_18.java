package src.Chapter5;

public class Exercise_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        String line = "";
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                line += "* ";
            }
            System.out.println(line);
            line = "";
        }

        System.out.println("Pattern B");
        for (int x = 6; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                line += "x ";
            }
            System.out.println(line);
            line = "";
        }

        System.out.println("Pattern C");
        for (int m = 1; m <= 6; m++) {
            for (int n = 1; n <= m; n++) {
                line += "x ";
            }
            System.out.printf("%12s\n", line);
            line = "";
        }

        System.out.println("Pattern D");
        for (int x = 6; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                line += "x ";
            }
            System.out.printf("%12s \n", line);
            line = "";
        }


    }
}
