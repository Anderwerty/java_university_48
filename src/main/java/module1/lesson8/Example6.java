package module1.lesson8;

public class Example6 {
    public static void main(String[] args) {
        int[][] months2D = {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(months2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
