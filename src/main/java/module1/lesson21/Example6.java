package module1.lesson21;

public class Example6 {
    public static void main(String[] args) {

        System.out.println("Start");
        try {
            //java.lang.OutOfMemoryError
            long[] items = new long[Integer.MAX_VALUE - 4];
            int length = items.length;
            System.out.println("length: "+length);
        } catch (Error error){
            System.out.println("error: "+error);
        }
        System.out.println("End");
    }
}
