package module2.lesson14;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class Example1 {
    public static void main(String[] args) {
        new MyThread().start();

        MyRunnable task = new MyRunnable();
        new Thread(task).start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // some logic
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // some logic
    }
}

class SerialExecutor implements Executor {
    final Queue<Runnable> tasks = new ArrayDeque<>();
    final Executor executor;
    Runnable active;

    SerialExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public synchronized void execute(Runnable task) {
        Runnable innerTask = () -> {
            try {
                task.run();
            } finally {
                scheduleNext();
            }
        };

        tasks.add(innerTask);

        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }
}
