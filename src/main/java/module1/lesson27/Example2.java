package module1.lesson27;

public class Example2 {
    public static void main(String[] args) {
        int repeat = 10;
        long start = System.currentTimeMillis();
        //some action

        for (int i = 1; i <= repeat; i++) {
            doSomething();
        }

        long end = System.currentTimeMillis();

        System.out.println("Average time to execute: " + (end - start) / repeat + "ms");
    }

    private static void doSomething() {
        long value = 0;
        for (long i = 0; i < Integer.MAX_VALUE / 10; i++) {
            value++;
        }
    }
}
