package module2.lesson14;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Example2 {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(8);
        ExecutorService executorService2 = Executors.newWorkStealingPool(4);
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);

    }
}
