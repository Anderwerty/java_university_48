package module1.lesson4;

public class Example16 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println(a == b);

        double d = 10.00100;
        double c = 10.00105;
        double delta = 0.005;

        System.out.println(Math.abs(c - d) < delta);
    }
}
