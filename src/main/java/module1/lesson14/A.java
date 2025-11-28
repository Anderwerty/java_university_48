package module1.lesson14;

public class A {

    public static int staticValue;

    public int noStaticValue;


    public A() {
        System.out.println("static:" + this.staticValue);
        System.out.println("non-static: " + this.noStaticValue);
    }

    public static void staticMethod() {
        System.out.println("static method");
        //this.nonStaticMethod(); // we cannot use this here
//        A a = new A();
//        a.nonStaticMethod();
        new A().nonStaticMethod();
    }

    public void nonStaticMethod() {
        System.out.println("non-static method");
        staticMethod();
    }

}
