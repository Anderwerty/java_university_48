package module1.lesson8;

public class Example3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];

        System.out.println(matrix1[0][0]);
        System.out.println(matrix1[0][1]);
        System.out.println(matrix1[1][0]);
        System.out.println(matrix1[1][1]);

        matrix1[0][0] = 100;
        matrix1[1][1]++;
        System.out.println("==========");
        System.out.println(matrix1[0][0]);
        System.out.println(matrix1[0][1]);
        System.out.println(matrix1[1][0]);
        System.out.println(matrix1[1][1]);
    }
}
