package module2.lesson8;

public class Example5 {

    private static final String LINE_SEPARATOR = "=".repeat(100);

    public static void main(String[] args) {
        new Five();
        System.out.println(LINE_SEPARATOR);
        new Five();
        System.out.println(LINE_SEPARATOR);
        new Five();
    }
}

class Five {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("no-static block");
    }


    public Five() {
        System.out.println("constructor");
    }
}
