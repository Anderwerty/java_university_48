package module1.lesson6;

public class Example11 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                break;
            }
            System.out.println("after if: " + i);
        }
    }
}
