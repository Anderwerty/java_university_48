package module1.lesson22_23;

import java.io.Closeable;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {

        try (MyResource2 resource = new MyResource2()) {
            resource.someMethod();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

class MyResource2 implements Closeable {

    public MyResource2() throws IOException {
        boolean isBad = false;
        if (isBad) {
            throw new IOException();
        }
    }

    public void someMethod() {
        boolean isWorking = false;
        if(!isWorking){
            throw new RuntimeException();
        }
        System.out.println("Working");
    }

    @Override
    public void close() {
        //some logic to release resource
        System.out.println("close my resource 2");
    }
}
