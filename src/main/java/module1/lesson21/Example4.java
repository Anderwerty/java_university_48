package module1.lesson21;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Start");
//        registerYourData();
        try {
            registerYourData();
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            System.out.println("Not valid age!!!");
        }

        System.out.println("End");
    }

    private static void registerYourData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int age = scanner.nextInt();

        if (age <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
