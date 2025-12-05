package module1.lesson16;

import java.util.ArrayList;

public class Example12 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(5);

        System.out.println(integers);

        integers.remove(new Integer(4));
        System.out.println(integers);

        System.out.println("arraylist clear");
        integers.clear();
        System.out.println(integers);



    }
}
