package module2.lesson6;

public class Example1 {
    public static void main(String[] args) {
        A a = new A();
        boolean isMarked = a instanceof MyMarker;

        System.out.println(isMarked);
    }
}

interface MyMarker {

}

class A implements MyMarker {

}
