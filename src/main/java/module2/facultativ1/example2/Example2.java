package module2.facultativ1.example2;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2 {
    public static void main(String[] args) {
        Buffer<Integer> integerBuffer = new Buffer<>(10);
        Thread thread1 = new Thread(new Consumer<>(integerBuffer, 1000));
        Thread thread2 = new Thread(new Producer<>(integerBuffer, () -> (int) System.currentTimeMillis(), 1000));

        thread1.start();
        thread2.start();
    }
}

class Buffer<T> {
    private final int maxSize;
    private final Queue<T> items;

    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public Buffer(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayDeque<>();
    }

    public void put(T item) {
        lock.lock();

        try {
            while (items.size() == maxSize) {
                notFull.await();
            }
            items.add(item);
            notEmpty.signal();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public T getItem() {
        lock.lock();
        try {
            while (items.isEmpty()) {
                notEmpty.await();
            }
            T item = items.remove();
            notFull.signal();
            return item;

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }
}

interface Factory<T> {
    T create();
}

class Producer<T> implements Runnable {
    private final Buffer<T> buffer;
    private final Factory<T> factory;
    private final int numberOfIteration;
    private final String id;

    public Producer(Buffer<T> buffer, Factory<T> factory, int numberOfIteration) {
        this.buffer = buffer;
        this.factory = factory;
        this.numberOfIteration = numberOfIteration;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfIteration; i++) {
            buffer.put(factory.create());
            System.out.println("Producer: " + id + ", iteration number: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer<T> implements Runnable {
    private final Buffer<T> buffer;
    private final int numberOfIteration;
    private final String id;

    public Consumer(Buffer<T> buffer, int numberOfIteration) {
        this.buffer = buffer;
        this.numberOfIteration = numberOfIteration;
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfIteration; i++) {
            T item = buffer.getItem();
            System.out.println("Consumer: " + id + ", iteration number: " + i + ", item: " + item);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

