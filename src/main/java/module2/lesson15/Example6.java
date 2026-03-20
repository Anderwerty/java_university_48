package module2.lesson15;

import java.util.ArrayList;
import java.util.Map;

public class Example6 {
    public static void main(String[] args) {
        Integer a =  Integer.valueOf(120);
        Integer b = 120;
        Boolean b1 = true;
        Boolean b2 = true;

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
