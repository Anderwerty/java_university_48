package module1.lesson7;

public class Example10 {
    public static void main(String[] args) {
        int[] array = new int[10];

        array[2] = 5;
        array[7] = 11;
        array[array[3]] = 2; // array[0] = 2
        array[8]++;

        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // 2  0  5  0  0  0  0  11  1  0
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
