package module1.lesson4;

public class Example2 {
    public static void main(String[] args) {
        String line = "=".repeat(100);

        System.out.println("AND(&& - short form, & long/full form)");
        System.out.println(line);
        System.out.println("true && true=" + (true && true));
        System.out.println("false && true=" + (false && true));
        System.out.println("true && false=" + (true && false));
        System.out.println("false && false=" + (false && false));
        System.out.println(line);
        System.out.println("true & true=" + (true & true));
        System.out.println("false & true=" + (false & true));
        System.out.println("true & false=" + (true & false));
        System.out.println("false & false=" + (false & false));

        System.out.println("OR");
        System.out.println(line);
        System.out.println("true || true=" + (true || true));
        System.out.println("false || true=" + (false || true));
        System.out.println("true || false=" + (true || false));
        System.out.println("false || false=" + (false || false));
        System.out.println(line);
        System.out.println("true | true=" + (true | true));
        System.out.println("false | true=" + (false | true));
        System.out.println("true | false=" + (true | false));
        System.out.println("false | false=" + (false | false));
    }
}
