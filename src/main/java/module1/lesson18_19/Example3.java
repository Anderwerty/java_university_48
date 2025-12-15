package module1.lesson18_19;

public class Example3 {
    public static void main(String[] args) {
        B b = new B(1);

        C c = new C(b);
        System.out.println(c);

        b.setValue(-1000);
        System.out.println(c);

        B b1 = c.getB();
        b1.setValue(1_000_000);
        System.out.println(c);

    }
}

class B{
    private int value;

    public B(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return "B=[value: "+value+"]";
    }
}

// final on class
final class C{
    private final B b;

    public C(B b){
        this.b = new B(b.getValue());
    }

    public B getB(){
        return new B(b.getValue());
    }

    @Override
    public String toString(){
        return "C=[b="+b+"]";
    }
}
