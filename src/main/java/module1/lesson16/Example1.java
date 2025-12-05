package module1.lesson16;

public class Example1 {
    public static void main(String[] args) {
        Integer a = 1000; // 10(int) --> autoboxing Integer(10)
        Integer b = 1000;
        Integer.valueOf(10);

        System.out.println(a == b);

        System.out.println(a.equals(b));

        Integer result = a + b;
        // Integer a(1000) unboxing --> 1000
        // Integer b(1000) unboxing --> 1000
        // 1000 + 1000 --> 2000
        // 2000 autoboxing ---> Integer(2000)

        Byte ba = 10; // 10(int) --> cast to byte ---> autoboxing
        Long la = 10L;

        Float fa = 1.0F;
        Double da = 1D;

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.NaN);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
    }
}
