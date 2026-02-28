package module2.lesson8;

public class Example4 {
    public static void main(String[] args) {

    }
}

class ThirdClass {
    private int value;
    private static int staticValue;

    static {
        //value = 1;
        staticValue = 1;
    }

    {
        value = 1;
        staticValue = 2;
    }
}
