package module2.lesson4;

public class Example3 {
    public static void main(String[] args) {
        AbstractRunnable runnable = new RunnableImpl();
        runnable.run();
        runnable.fastRun();
    }
}

interface IRunnable {
    public static final int VALUE = 10;

    public abstract void run();

    public abstract void fastRun();
}

 abstract class AbstractRunnable {

    private int value;

    public abstract void run();

    public abstract void fastRun();

    public final void finalMethod(){}
}

class RunnableImpl extends AbstractRunnable {

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void fastRun() {
        System.out.println("fast run");
    }
}
