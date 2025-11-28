package module1.lesson14;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("=========");
        User user1 = new User();
        System.out.println("=========");
        User user2 = new User();
    }
}

class User {
    public static final int CONSTANT_INT;

    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
        CONSTANT_INT = 10;
    }

    {
        System.out.println("non-static block 1");
    }

    public User(){
        System.out.println("constructor");
    }

    {
        System.out.println("non-static block 2");
    }
}
