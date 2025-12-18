package module1.lesson21;

public class Example8 {
    public static void main(String[] args) {
        int value = -10;

        if (value < 0) {
            throw new IllegalArgumentException("values is less than zero");
        }
    }
}
