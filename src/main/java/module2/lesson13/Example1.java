package module2.lesson13;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        MyDemonThread myDemonThread = new MyDemonThread();
        myDemonThread.setDaemon(true);

        myDemonThread.start();
        Thread.sleep(10_000);
        System.out.println("main end");
    }
}

class MyDemonThread extends Thread {
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("I'm working ....");
        }
    }
}
