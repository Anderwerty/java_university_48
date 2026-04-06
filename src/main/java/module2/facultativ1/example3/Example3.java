package module2.facultativ1.example3;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Example3 {
    public static void main(String[] args) {
        Container source = new Container();
        Container target = new Container();

    }
}

class MyThread extends Thread {
    private final Container source;
    private final Container target;

    MyThread(Container source, Container target) {
        this.source = source;
        this.target = target;
    }


    @Override
    public void run() {
        // 1 get source monitor
        // 2 get target monitor
        // 3 do action
        // 4 release target monitor
        // 5 release source monitor

        synchronized (source.getLock()) {
            synchronized (target.getLock()) {

                int value = source.get();
                target.put(value);
            }
        }
    }
}

class Container {

    private final String id = UUID.randomUUID().toString();
    private final Queue<Integer> items = new ArrayDeque<>();

    private final Object lock = new Object();

    public int get() {
        synchronized (lock) {
            Integer item = items.remove();

            System.out.println("Get by : " + id + ", value: " + item);
            return item;
        }
    }

    public void put(int value) {
        synchronized (lock) {
            System.out.println("Put by : " + id + ", value: " + value);
            items.add(value);
        }
    }

    public Object getLock(){
        return lock;
    }
}


