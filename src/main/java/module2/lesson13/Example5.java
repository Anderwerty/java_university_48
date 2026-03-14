package module2.lesson13;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Function;

public class Example5 {
    public static void main(String[] args) {
        Callable<Void> callable = () -> {
            System.out.println("callable");
            return null;
        };
        Runnable runnable = () -> {
            System.out.println("runnable");

        };

        new Thread(runnable).start();
    }
}
