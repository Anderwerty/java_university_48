package module2.lesson11;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() ->
        {
            int counter = 0;
            while (true) {
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(counter++);
            }
        });

        thread.start();

        Thread.sleep(10_000);

        //thread.stop();

        System.out.println("End: "+Thread.currentThread().getName());
    }

}
