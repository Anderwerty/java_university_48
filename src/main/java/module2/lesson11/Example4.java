package module2.lesson11;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        ClockImpl clock = new ClockImpl();
        clock.start();

        Thread.sleep(10_000);

        clock.stopWork();

        System.out.println("=".repeat(100));

        Clock clock1 = new Clock();
        Thread thread = new Thread(clock1);
        thread.start();
        Thread.sleep(10_000);

        thread.interrupt();

    }
}

class ClockImpl extends Thread {
    private boolean work = true;

    public void stopWork(){
        work = false;
    }

    @Override
    public void run(){
        while (work){
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tik");
        }
    }
}

class Clock implements Runnable{

    @Override
    public void run(){
        Thread currentThread = Thread.currentThread();
        while(!currentThread.isInterrupted()){
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                currentThread.interrupt();
            }
            System.out.println("Tik");
        }

    }
}
