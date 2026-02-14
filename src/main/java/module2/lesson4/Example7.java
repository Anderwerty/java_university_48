package module2.lesson4;

public class Example7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        if(a instanceof Securable){
            //
        } else {
            //
        }
    }
}

class A implements Securable{
    //...
}

class B implements Securable{
    //....
}

interface Securable{

}
