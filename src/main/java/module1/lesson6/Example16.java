package module1.lesson6;

import java.util.Scanner;

public class Example16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s;
        while ( !"exit".equals(s = console.nextLine())) {
            System.out.println(s);
        }

        System.out.println("end");
    }
}
