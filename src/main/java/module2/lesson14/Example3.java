package module2.lesson14;

import module1.lesson14.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class Example3 {
    public static void main(String[] args) throws Exception {
        try(ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            List<Task> tasks = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                tasks.add(new Task());
            }
            List<Future<String>> futures = executorService.invokeAll(tasks);
//            System.out.println(executorService.isTerminated());
//            System.out.println(executorService.isShutdown());

            System.out.println(futures.size());
            Future<String> stringFuture = futures.get(0);
            System.out.println(stringFuture.isDone());
            System.out.println(stringFuture.get());

//            List<Runnable> runnables = executorService.shutdownNow();

            Future<?> submit = executorService.submit(() -> {
            });
            System.out.println(executorService.isTerminated());
            System.out.println(executorService.isShutdown());
//            System.out.println(runnables.size());
        }

    }
}

class Task implements Callable<String> {
    private static long counter = 1;

    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep((counter) * 1);
        return UUID.randomUUID().toString();
    }
}




















