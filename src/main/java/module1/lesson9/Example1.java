package module1.lesson9;

public class Example1 {
    public static void main(String[] args) {
        int[][] months2D = {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        };

//        for (int i = 0; i < months2D.length; i++) {
//            for (int j = 0; j < months2D[i].length; j++) {
//                System.out.print(months2D[i][j] + " ");
//            }
//            System.out.println();
//        }

        printArray(months2D);

        months2D[0][0] = 1000;

//        for (int i = 0; i < months2D.length; i++) {
//            for (int j = 0; j < months2D[i].length; j++) {
//                System.out.print(months2D[i][j] + " ");
//            }
//            System.out.println();
//        }

        printArray(months2D);
    }

    public static void printArray(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "      ");
            }
            System.out.println();
        }
    }
}
