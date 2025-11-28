package module1.lesson14;

public class Example6 {
    public static void main(String[] args) {
        new User2.Address();
        new User2.Address();
    }
}

class User2 {


    static {
        System.out.println("User static block 1");
    }

    static {
        System.out.println("User static block 2");
    }

    private static final int VALUE =123456;


    {
        System.out.println("User non-static block 1");
    }

    public User2() {
        System.out.println("User constructor");
    }

    {
        System.out.println("User non-static block 2");
    }

    public static class Address {
        static {
            System.out.println("Address static block 1" + User2.VALUE);
        }

        static {
            System.out.println("Address static block 2");
        }

        {
            System.out.println("Address non-static block 1");
        }

        public Address() {
            System.out.println("Address constructor");
        }

        {
            System.out.println("Address non-static block 2");
        }
    }
}
