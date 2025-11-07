package module1.lesson7;

public class Example6 {
    public static void main(String[] args) {
        boolean[] students = new boolean[10];
        System.out.println(students[0]);
        char[] symbols = new char[2];
        System.out.println(symbols[1]);

        String[] strings = new String[10];
        String string = strings[2];
        System.out.println(string);

        if (string != null) {
            System.out.println(string.toUpperCase());
        } else {
            System.out.println("string is null");
        }
    }
}
