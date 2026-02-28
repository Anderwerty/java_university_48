package module2.lesson8;

public class Example3 {
    public static void main(String[] args) {
        new SecondClass();
        new SecondClass();
    }
}

class SecondClass {

    {
        System.out.println("1 no-static block");
    }

    public SecondClass(){
        System.out.println("constructor");
    }

    {
        System.out.println("2 no-static block");
    }
}
