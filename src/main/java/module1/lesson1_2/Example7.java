package module1.lesson1_2;

public class Example7 {
    public static void main(String[] args) {
        int a = 2_000_000_000;
        int b = 5;
        System.out.println(b);
        b = 1;
        System.out.println(b);
        b = a;// a --> 2_000_000_000 --> b
        System.out.println(b);
    }
}
