package module2.lesson7;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        Object objectInteger = 10.2;
        Object objectString = "Hello";
        Object object = new Object();
        Object objectList = new ArrayList<>();
        Object items = new int[10];
        Object objects = new Object[100];

        boolean isString = objectString instanceof String;
        System.out.println(isString);

        if(objectInteger instanceof Number number){
            System.out.println(number.intValue() + 1);
        }
    }
}
