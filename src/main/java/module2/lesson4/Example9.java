package module2.lesson4;

public class Example9 {
}

interface ID1{
    void method();
}

interface ID2{
    default void method(){

    }
}

class MyClass3 implements ID1, ID2{

    @Override
    public void method() {
        System.out.println("method");
        ID2.super.method();
    }
}
