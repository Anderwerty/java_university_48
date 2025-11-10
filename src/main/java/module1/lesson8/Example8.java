package module1.lesson8;

public class Example8 {
    public static void main(String[] args) {
        int[][] months2D = {
                {31, 28, 31, 100},
                {30, 31, 30},
                {31, 31},
                {31, 30, 31, 100 }
        };

        for (int i = 0; i < months2D.length; i++) {
            for (int j = 0; j < months2D[i].length; j++) {
                System.out.print(months2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
