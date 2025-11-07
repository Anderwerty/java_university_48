package module1.lesson7;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        String[] strings = {"hello", null, "hi",};

        System.out.println(strings.length);


        Object[] objects = new Object[10];
        objects[0] = "String";
        objects[1] = new Scanner(System.in);
        objects[2] = strings;

        Object object = objects;
    }
}
