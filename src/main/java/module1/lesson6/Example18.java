package module1.lesson6;

import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(" ");
        int counter = 1;
        while (scanner.hasNext()) {
            System.out.println(counter++);
            System.out.println(scanner.next());
        }

    }
}
