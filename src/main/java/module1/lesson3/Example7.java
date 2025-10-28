package module1.lesson3;

public class Example7 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        String line = "=";

        System.out.println(line.repeat(100));
        System.out.println("!");

        System.out.println(!a);
        System.out.println(!b);

        System.out.println("&&(AND)");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(line.repeat(100));

        System.out.println("||(OR)");

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(line.repeat(100));

        System.out.println("^(XOR)");

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(line.repeat(100));

    }
}
