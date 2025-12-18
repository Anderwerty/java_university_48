package module1.lesson21;

public class Example9 {
    public static void main(String[] args) throws MyCheckedException {
        int value = -10;

        if (value < 0) {
//            throw new MyUncheckedException("values is less than zero");
            throw new MyCheckedException("values is less than zero");
        }
    }
}

class MyUncheckedException extends RuntimeException {
    public MyUncheckedException() {
        super();
    }

    public MyUncheckedException(String message) {
        super(message);
    }
}

class MyCheckedException extends Exception {
    public MyCheckedException(String message){
        super(message);
    }
}
