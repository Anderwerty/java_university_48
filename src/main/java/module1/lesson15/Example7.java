package module1.lesson15;

public class Example7 {
    public static void main(String[] args) {
        Integer a =101;// Integer.valueOf(128)
        Integer b =101;

        Integer.valueOf(128);

        System.out.println(a == b);//???
        System.out.println(a.equals(b));

        Long la = 10L;
        Long.valueOf(10);
    }
}
