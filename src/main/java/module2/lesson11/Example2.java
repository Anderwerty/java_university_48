package module2.lesson11;

public class Example2 {
    public static void main(String[] args) {
        MyRunner myRunner = new MyRunner();

        Thread thread0 = new Thread(myRunner);
        Thread thread1 = new Thread(myRunner);
        Thread thread2 = new Thread(() ->
                System.out.println("running: " + Thread.currentThread().getName()));

        thread0.start();
        thread1.start();
        thread2.start();
    }
}

class MyRunner implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("running: " + Thread.currentThread().getName());

    }
}
