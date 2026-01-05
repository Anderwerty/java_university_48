package module1.lesson22_23;

import java.io.Closeable;

public class Example7 {
    public static void main(String[] args) {
//        Connection connection = new Connection();
//        Request request = connection.getRequest();


// in this case resource connection won't be closed
//        try(Request request = new Connection().getRequest()) {
//            request.execute();
//        }


        try (Connection connection = new Connection();
             Request request = connection.getRequest()) {
            request.execute();
        }


    }
}

class Connection implements Closeable {
    public Request getRequest() {
        return new Request();
    }

    @Override
    public void close() {
        System.out.println("close Connection");
    }

    // every bad idea object can be not destroyed by GC
    @Override
    public void finalize() {
        this.close();
    }
}

class Request implements Closeable {

    @Override
    public void close() {
        System.out.println("close request");
    }


    public void execute() {
        System.out.println("execute");
    }
}
