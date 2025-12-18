package module1.lesson21;

public class Example7 {
    public static void main(String[] args) {
        int value = 1;
        try {
            if (value < 10) {
                throw new RuntimeException();
//                System.err.println("");
            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("Caught exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
