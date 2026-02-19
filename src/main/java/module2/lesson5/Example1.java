package module2.lesson5;

import module1.lesson14.A;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> stringItems = new ArrayList<>();
        stringItems.add("1");
        stringItems.add("1");
        stringItems.add("Two");
        System.out.println(stringItems.size());

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(10);
        integers.add(Integer.valueOf(20));
//        integers.add("1");

        List objects = new ArrayList();
        objects.add(1);
        objects.add("String");
        objects.add(new Object[10]);


        Object rawValue = objects.get(2);
        if (rawValue instanceof Integer value) {
            System.out.println("Integer: " + value);
        } else if (rawValue instanceof Object[] items) {
            System.out.println("Arrays of objects, size: " + items.length);
        }

    }
}
