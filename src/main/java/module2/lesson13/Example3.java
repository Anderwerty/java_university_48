package module2.lesson13;

public class Example3 {
    public static void main(String[] args) {

    }
}

enum SingletonEnum {
    ONE;
}

class SimpleSingletonWithoutLazyInitialization {
    private static final SimpleSingletonWithoutLazyInitialization INSTANCE =
            new SimpleSingletonWithoutLazyInitialization();

    private SimpleSingletonWithoutLazyInitialization() {
    }

    public static SimpleSingletonWithoutLazyInitialization getInstance() {
        return INSTANCE;
    }
}

class SimpleSingletonWithLazyInitialization {
    private static SimpleSingletonWithLazyInitialization instance;

    private SimpleSingletonWithLazyInitialization() {
    }

    public static SimpleSingletonWithLazyInitialization getInstance() {
        if (instance == null) {
            instance = new SimpleSingletonWithLazyInitialization();
        }
        return instance;
    }
}

class SingletonWithLazyInitializationMultiThreads {

    private static SingletonWithLazyInitializationMultiThreads instance;

    private SingletonWithLazyInitializationMultiThreads() {
    }

    //SingletonWithLazyInitializationMultiThreads.class
    public static synchronized SingletonWithLazyInitializationMultiThreads getInstance() {
        if (instance == null) {
            instance = new SingletonWithLazyInitializationMultiThreads();
        }
        return instance;
    }

}

class SingletonLazyWithDoubleCheck {
    private static SingletonLazyWithDoubleCheck instance;

    private SingletonLazyWithDoubleCheck() {

    }

    public static SingletonLazyWithDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyWithDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonLazyWithDoubleCheck();
                }
            }
        }
        return instance;
    }
}

class SingletonLazyWithDoubleCheck2 {
    private static final Object LOCK = new Object();
    private static SingletonLazyWithDoubleCheck2 instance;

    private SingletonLazyWithDoubleCheck2() {

    }

    public static SingletonLazyWithDoubleCheck2 getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new SingletonLazyWithDoubleCheck2();
                }
            }
        }
        return instance;
    }
}

class SingletonLazyWithDoubleCheck3 {
    private static final Object LOCK = new Object();
    private static SingletonLazyWithDoubleCheck3 instance;

    private int a;

    private SingletonLazyWithDoubleCheck3() {

    }

    private void setA(int a) {
        this.a = a;
    }

    public static SingletonLazyWithDoubleCheck3 getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    SingletonLazyWithDoubleCheck3 instance1 = new SingletonLazyWithDoubleCheck3();
                    instance1.setA(10);
                    instance = instance1;

                }
            }
        }
        return instance;
    }
}


