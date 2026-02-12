package module2.lesson2;

public class Example3 {
    public static void main(String[] args) {

    }
}

class B {

    void method(){
        System.out.println("B method");
    }
}

class C {
    void method(){
        System.out.println("C method");
    }
}

// is
//class D extends  B, C{
//
//}


// has
class F {
    private B b;
    private C c;

    //
}
