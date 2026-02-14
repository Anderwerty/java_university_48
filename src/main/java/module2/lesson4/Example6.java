package module2.lesson4;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(MyInterface2.max(100, 2));
       // new MyClass2().max(100,2);
       // MyClass2.max(100, 2);
    }
}

interface MyInterface2 {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static void method(){
        System.out.println(" static private method");
    }
}

class MyClass2 implements MyInterface2{

}
