package module1.lesson16;

import java.util.ArrayList;

public class Example9 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);

        System.out.println(integers.size());
        System.out.println(integers);

        integers.add(0,3);
        System.out.println(integers);

        System.out.println(integers.contains(2));
        System.out.println(integers.contains(100));


    }
}
