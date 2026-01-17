package module1.lesson26;

public class Example0 {
    public static void main(String... args) {
        System.out.println(max(1, 2, -3, 4, 0));
        System.out.println(max(1, new int[]{1, 2, -3}));
        max(1, null);
//        max(1);
    }

    private static int max(int value, int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        return max;
    }

}
