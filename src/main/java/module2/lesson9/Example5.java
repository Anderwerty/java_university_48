package module2.lesson9;

public class Example5 {
    public static void main(String[] args) {
        B b = new B(1);
        A a = new A(b);
        System.out.println(a);
        a.getB().setValue(1_000_000);
        System.out.println(a);
        b.setValue(12345);
        System.out.println(a);
    }
}

final class A {
    private final B b;

    public A(B b) {
        this.b = copyB(b);
    }

    public B getB() {
        return copyB(b);
    }

    private static B copyB(B b){
        return b == null ? null : new B(b.getValue());
    }

    @Override
    public String toString() {
        return "A->b=" + String.valueOf(b);
    }

}

// B class we cannot change
class B {
    private int value;

    public B(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "B->value=" + value;
    }
}
