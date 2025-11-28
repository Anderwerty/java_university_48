package module1.lesson14;

public class OuterClass {

    public static int staticValue;
    private int nonStaticValue;

    public static void staticMethod() {
        System.out.println("Outer: static method, staticValue: " + staticValue + "," +
                " inner static" + InnerClass.staticValue);
    }

    public void nonStaticMethod() {
        System.out.println("Outer: non-static method, staticValue: "
                + staticValue + ", non-static: " + nonStaticValue +
                ", inner static" + InnerClass.staticValue);
    }

    class InnerClass {
        public static int staticValue;
        public int nonStaticValue1;

        public static void staticMethod() {
            System.out.println("Inner: static method," +
                    " outer-class static: " + OuterClass.staticValue);
        }

        //HW1 ??
        public void nonStaticMethod() {
            System.out.println("Inner: non-static method, outer-class nonStaticValue: "
                    + nonStaticValue);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.nonStaticMethod();

        OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();

    }
}
