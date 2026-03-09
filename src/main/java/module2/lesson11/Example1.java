package module2.lesson11;

import java.util.UUID;

public class Example1 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        String threadPrefix = UUID.randomUUID().toString();
        myThread.setName(threadPrefix + "_thread");

        System.out.println("main: " + Thread.currentThread().getName());
        myThread.start();
        // 'run' in current thread - main, and new thread will not be created
        // 'start' in new thread - new
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " is running");
        System.out.println("my_thread: " + Thread.currentThread().getName());

    }
}
