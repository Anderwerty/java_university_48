package module1.lesson20;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
    }
}

enum EnumSingleton {
    INSTANCE;

    // add some methods
}

final class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    private Singleton2() {

    }
}

final class Singleton3 {

    private static Singleton3 instance;

    // lazy initialization
    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    private Singleton3() {

    }
}