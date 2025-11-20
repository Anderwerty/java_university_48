package module1.lesson12;

public class Example4 {
    public static void main(String[] args) {
        char symbol = '\u0000';
        for (int i = 0; i < 250; i++) {
            System.out.println(symbol++);
        }
    }
}
