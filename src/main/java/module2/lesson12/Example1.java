package module2.lesson12;

import java.util.List;
public class Example1 {
    public static void main(String[] args) {
        Container container = new Container();



        int iterationNumber = 1000000;
        Producer producer1 = new Producer(container, iterationNumber);
        Producer producer2 = new Producer(container, iterationNumber);
        Producer producer3 = new Producer(container, iterationNumber);
        Producer producer4 = new Producer(container, iterationNumber);
        Consumer consumer1 = new Consumer(container, iterationNumber);
        Consumer consumer2 = new Consumer(container, iterationNumber);
        Consumer consumer3 = new Consumer(container, iterationNumber);
        Consumer consumer4 = new Consumer(container, iterationNumber);

        List<Thread> threads = List.of(producer1, producer2, producer3, producer4, consumer1, consumer2, consumer3, consumer4);

        threads.forEach(Thread::start);
        synchronized (container){
            boolean b = true;
            while (b){

            }
        }
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        System.out.println("Main end");
    }
}

class Container {

    private final Object lock = new Object();
    private volatile int value = 0;

    // ++value ---> value = value + 1;
    public  void increment() {
        synchronized (lock) {
            System.out.println("Increment:" + ++value);
            Thread.yield();
        }
    }

    public void decrement() {
        synchronized (lock) {
            System.out.println("Decrement:" + --value);
        }
    }


    public static void staticMethod() {
        synchronized (Container.class) {
            System.out.println();
        }
    }
}

class Producer extends Thread {
    private final Container container;
    private final int iterationNumber;

    Producer(Container container, int iterationNumber) {
        this.container = container;
        this.iterationNumber = iterationNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterationNumber; i++) {
            container.increment();
        }
    }
}

class Consumer extends Thread {
    private final Container container;
    private final int iterationNumber;

    Consumer(Container container, int iterationNumber) {
        this.container = container;
        this.iterationNumber = iterationNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterationNumber; i++) {
            container.decrement();
        }
    }
}
