package module1.lesson3;

public class Example2 {
    public static void main(String[] args) {
        byte a = 127; // -128, 127
        a+=128; // a = a + 127;

        System.out.println(a);

        byte b = -128;
        b-=128;
        System.out.println(b);

        byte c = Byte.MIN_VALUE;
    }
}
