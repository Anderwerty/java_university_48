package module1.lesson12;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        String text = "my text";
        String text2 = new String("my text 2");

        Scanner textScanner = new Scanner("1 2 3 4");

        int[] items = new int[10];
        int[] items2 = {};

        UserRegistration registration =
                new UserRegistration("login", "password123456");

        System.out.println("your login: " + registration.login +
                ", password: " + registration.password);


    }
}

class UserRegistration {
    public String login;
    public String password;

    public UserRegistration(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
