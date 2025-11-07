package module1.lesson4_5;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        System.out.println("Print you age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You can find a job!");
        } else{
            System.out.println("You cannot work!");
        }

        System.out.println("End");
    }
}
