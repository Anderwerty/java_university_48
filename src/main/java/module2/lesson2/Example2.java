package module2.lesson2;

public class Example2 {
    public static void main(String[] args) {
        new Base("A");
    }
}

class Base {

    public Base() {
        super();
        System.out.println("Base constructor without parameters");
    }

    public Base(String name) {
        this();
        System.out.println("Base constructor with parameters");
    }
}
