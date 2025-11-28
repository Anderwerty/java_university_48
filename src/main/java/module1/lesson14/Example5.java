package module1.lesson14;

public class Example5 {
    public static void main(String[] args) {
        User1 user = new User1();

        user.new Address();
        user.new Address();
    }
}

class User1 {

    static {
        System.out.println("User static block 1");
    }

    static {
        System.out.println("User static block 2");
    }

    {
        System.out.println("User non-static block 1");
    }

    public User1(){
        System.out.println("User constructor");
    }

    {
        System.out.println("User non-static block 2");
    }

    public class Address{
        static {
            System.out.println("Address static block 1");
        }

        static {
            System.out.println("Address static block 2");
        }

        {
            System.out.println("Address non-static block 1");
        }

        public Address(){
            System.out.println("Address constructor");
        }

        {
            System.out.println("Address non-static block 2");
        }
    }
}

