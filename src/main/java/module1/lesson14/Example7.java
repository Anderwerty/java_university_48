package module1.lesson14;

//import module1.lesson14.MyOuterClass3.MyNestedClass3;

public class Example7 {
    public static void main(String[] args) {
        new MyOuterClass2().new MyInnerClass2();
        module1.lesson14.MyOuterClass3.MyNestedClass3 myNestedClass3 =
                new module1.lesson14.MyOuterClass3.MyNestedClass3();
    }
}

class MyOuterClass2 {
    class MyInnerClass2 {

    }
}

class MyOuterClass3{
    static class MyNestedClass3{

    }
}

