package module1.lesson10;

public class Example9 {
    public static void main(String[] args) {
        String message = "Methods from class String from";

        System.out.println(message.indexOf("from"));
        System.out.println(message.indexOf("from", 10));


        System.out.println(message.lastIndexOf("from"));
        System.out.println(message.lastIndexOf("from", 10));

        System.out.println("A".repeat(100));
        System.out.println("ABCD".replace('A', '*'));
        System.out.println(message.replace("Methods", "Functions"));
    }
}
