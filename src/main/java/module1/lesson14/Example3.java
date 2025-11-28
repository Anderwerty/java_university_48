package module1.lesson14;

public class Example3 {
    public static void main(String[] args) {
//        MyOuterClass.NestedClass nestedClass
//                = new MyOuterClass.NestedClass();
//        nestedClass.nonStaticValue1 = 10;
//        nestedClass.nonStaticMethod();

        MyOuterClass.NestedClass.staticMethod();
    }
}

class MyOuterClass{

    public static int staticValue;

    public int nonStaticValue;

    public static void staticMethod() {
        System.out.println("Outer: static method");
    }

    public void nonStaticMethod() {
        System.out.println("Outer: non-static method");
    }

    static class NestedClass{
        public static int staticValue;

        public int nonStaticValue1;


        public static void staticMethod() {
            System.out.println("Outer: static method");
        }

        public void nonStaticMethod() {
           // System.out.println("Outer: non-static method"+nonStaticValue);
        }
    }

}
