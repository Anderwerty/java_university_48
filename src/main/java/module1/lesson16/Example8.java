package module1.lesson16;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(integers.isEmpty());
        System.out.println(integers.size());

        integers.add(null);
        System.out.println(integers.isEmpty());
        integers.add(1);
//        integers.add("5");


        System.out.println(integers.size());
    }
}
