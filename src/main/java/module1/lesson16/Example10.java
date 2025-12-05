package module1.lesson16;

import java.util.ArrayList;

public class Example10 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1); // index 0
        integers.add(2); // index 1
        integers.add(3); // index 2
        integers.add(4); // index 3
        integers.add(5); // index 4

        System.out.println(integers);

        // remove by using index
        integers.remove(3);
        System.out.println(integers);


    }
}
