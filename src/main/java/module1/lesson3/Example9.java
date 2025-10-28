package module1.lesson3;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        int age;
        String name;
        String aboutMe;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is you name?");
        name = scanner.next();
        System.out.println("What is your age?");
//        String ageAsString = scanner.next();
//        Integer.parseInt(ageAsString);

        age = scanner.nextInt();

        System.out.println("Some words about you");
        aboutMe = scanner.next();
        System.out.println("Hello " + name + ". Nice to see you. It seems that you have " + age + " years.");


    }
}
