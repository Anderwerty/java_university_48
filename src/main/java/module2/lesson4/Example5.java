package module2.lesson4;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        MyInterface myClass = new MyClass();
        System.out.println(myClass.execute(1));

        myClass.method("Hello");

        myClass.method2("Hello");
    }
}

interface MyInterface {
    int execute(int item);

    default void method(String text){
        throw new UnsupportedOperationException();
    }

    default void method2(String text){
        throw new UnsupportedOperationException();
    }
}

class MyClass implements MyInterface {

    @Override
    public int execute(int item) {
        return item;
    }

    @Override
    public void method(String text){
        System.out.println(text);
    }
}
