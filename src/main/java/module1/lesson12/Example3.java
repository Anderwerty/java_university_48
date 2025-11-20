package module1.lesson12;

public class Example3 {
    public static void main(String[] args) {
        double a = Double.POSITIVE_INFINITY;
        double b = Double.NEGATIVE_INFINITY;
        double c = Double.NaN;


        System.out.println(-a);
        System.out.println(a * a);
        System.out.println(a - a); // 10^50 - 10^100
        System.out.println(a / a);
        System.out.println(a + 1);

        System.out.println(c + a);

        System.out.println(c / c);
    }
}
