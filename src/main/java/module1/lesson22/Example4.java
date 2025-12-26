package module1.lesson22;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");

        method1();
    }

    private static void method1() {
        System.out.println();
        method2();
    }

    private static void method2() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement);
        }
    }
}
