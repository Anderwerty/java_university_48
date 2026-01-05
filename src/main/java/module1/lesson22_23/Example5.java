package module1.lesson22_23;

import java.io.Closeable;

public class Example5 {
    public static void main(String[] args) {
        MyResource1 resource1 = null;
        try {
            resource1 = new MyResource1();
            resource1.someMethod();
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            if (resource1 != null) {
                try {
                    resource1.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyResource1 implements Closeable {

    public void someMethod() {
        System.out.println("Working");
    }

    @Override
    public void close() {
        //some logic to release resource
        System.out.println("close my resource 1");
    }
}
