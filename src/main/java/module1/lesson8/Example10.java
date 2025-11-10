package module1.lesson8;

public class Example10 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][];

        System.out.println("======matrix1======");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        matrix1[1] = new int[100];


        System.out.println("======matrix2======");
        for (int i = 0; i < matrix2.length; i++) {
            System.out.print(matrix2[i] + " ");
        }
    }

}
