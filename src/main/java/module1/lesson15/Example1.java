package module1.lesson15;

public class Example1 extends Object {
    public static void main(String[] args) throws InterruptedException,
            ClassNotFoundException {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();

        System.out.println(myClass1.getClass() == myClass2.getClass());
        System.out.println(myClass1.getClass() == MyClass.class);
        System.out.println(myClass1.getClass() == Class.forName("module1.lesson15.MyClass"));


//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1_000);
//            System.out.println(i);
//        }



    }
}

