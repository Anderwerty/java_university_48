package module1.lesson8;

public class Example11 {
    public static void main(String[] args) {
        //option1
        int[][][][] matrix = new int[2][][][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[3][][];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new int[4][];
                for (int k = 0; k < matrix[i][j].length; k++)
                    matrix[i][j][k] = new int[5];
            }
        }

        //option2
        int[][][][] matrix2 =new int[2][3][4][5];
    }
}
