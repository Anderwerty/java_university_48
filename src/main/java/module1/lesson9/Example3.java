package module1.lesson9;

public class Example3 {
    public static void main(String[] args) {
        int a = 100;
        int b = -2;

        int result = findMax(a, b);
        System.out.println(result);

        System.out.println("===============");
        System.out.println(findMax(1_000_000, 2_000, -300));


        System.out.println("=================");
//        int[] items = null;
//        int[] items = {};
        int[] items = {1, -2,10, 34,3, 7, 0, 4,6,6,7,3};
        System.out.println(findMax(items));
    }

    public static int findMax(int a, int b) {
        int max = (a < b) ? b : a;
        return max;
    }

    public static int findMax(int a, int b, int c) {
        int maxAB = findMax(a, b);
        int maxABC = findMax(maxAB, c);

        return maxABC;
    }

    // items is not null, is not empty
    public static int findMax(int[] items) {
        int max = items[0];

        for (int i = 0; i < items.length; i++) {
            max = findMax(max, items[i]);
        }

        return max;
    }
}
