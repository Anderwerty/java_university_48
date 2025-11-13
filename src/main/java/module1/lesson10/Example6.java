package module1.lesson10;

public class Example6 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b); // true
        System.out.println(a.equals(b)); // true

        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
        System.out.println(c.intern() == a);
        System.out.println(c==a);
    }
}
