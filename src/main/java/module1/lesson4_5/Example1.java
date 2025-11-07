package module1.lesson4_5;

public class Example1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("NOT");
        System.out.println("!true=" + !a);
        System.out.println("!false=" + !b);

        System.out.println("AND");
        System.out.println("=".repeat(10));
        System.out.println("true && true=" + (true && true));
        System.out.println("false && true=" + (false && true));
        System.out.println("true && false=" + (true && false));
        System.out.println("false && false=" + (false && false));


        System.out.println("OR");
        System.out.println("=".repeat(10));
        System.out.println("true || true=" + (true || true));
        System.out.println("false || true=" + (false || true));
        System.out.println("true || false=" + (true || false));
        System.out.println("false || false=" + (false || false));

        System.out.println("XOR");
        System.out.println("=".repeat(10));
        System.out.println("true ^ true=" + (true ^ true));
        System.out.println("false ^ true=" + (false ^ true));
        System.out.println("true ^ false=" + (true ^ false));
        System.out.println("false ^ false=" + (false ^ false));

        boolean result = !(a&b)^(a||b);

    }
}
