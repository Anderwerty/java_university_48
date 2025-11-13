package module1.lesson9;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {
        int[] items = {1, 2, 3};

        System.out.println(Arrays.toString(items));

        method(items);

        System.out.println(Arrays.toString(items));

        method2(items);
        System.out.println(items.length);
        System.out.println(Arrays.toString(items));

    }

    public static void method(int[] items) {
        items[0] = 1_000_000;
    }

    public static void method2(int[] items) {
        items = new int[1000];
    }
}
