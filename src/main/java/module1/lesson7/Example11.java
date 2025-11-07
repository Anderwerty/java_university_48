package module1.lesson7;

public class Example11 {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        numbers[++numbers[0]]++;// numbers[1]++;

        numbers[3] = ++numbers[3] * 2;
        numbers[1] = numbers[3] + numbers[numbers[7]];
        //numbers[1] = numbers[3] + numbers[0];
        //numbers[1] = 2 + 1;

        // 0, 1, 2, 3, 4, 5, 6, 7
        // 1  3  0  2  0  0  0  0

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("array[" + i + "]=" + numbers[i]);
        }
    }
}
