package module1.lesson22;

public class Example3 {
    public static void main(String[] args) {

//        Thread.currentThread().setUncaughtExceptionHandler(new MyHandler());

        boolean isBad = true;
        if (isBad) {
            throw new IllegalArgumentException();
        }
    }
}

class MyHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println("==================");
        e.printStackTrace();
        System.err.println("==================");
    }
}
