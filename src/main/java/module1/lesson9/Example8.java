package module1.lesson9;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0};
        int[] b = a;

        System.out.println(a[2]);
        System.out.println(b[2]);

        b[0] = 1000;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
