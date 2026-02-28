package module2.lesson8;

public class Example7 {
    public static void main(String[] args) {
        new SubClass(1);
        System.out.println("=".repeat(100));
        new SubClass(2);
    }
}

class Super {
    {
        System.out.println("SuperClass no-static block");
    }

    static {
        System.out.println("SuperClass static block");
    }

    public Super() {
        super();
        System.out.println("Constructor Super");
    }

    public Super(int value) {
        super();
        System.out.println("Constructor Super");
    }
}

class SubClass extends Super {
    {
        System.out.println("SubClass no-static block");
    }

    static {
        System.out.println("SubClass static block");
    }

    public SubClass() {
        super();
        System.out.println("SubClass constructor without parameters");
    }

    public SubClass(int value) {
        this();
        System.out.println("SubClass constructor with parameters");

    }
}
