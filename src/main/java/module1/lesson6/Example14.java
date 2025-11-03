package module1.lesson6;

import java.util.Scanner;
import java.lang.String;

public class Example14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            String s = console.nextLine();
            if ("exit".equals(s)) {
                break;
            }
        }

        System.out.println("end");
    }
}
