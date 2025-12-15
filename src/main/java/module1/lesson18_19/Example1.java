package module1.lesson18_19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Character, Integer> symbolToCount = new HashMap<>();
//        symbolToCount.put('A', 1);
//        symbolToCount.put('B' ,10);
        symbolToCount.put('C', 1000);
        symbolToCount.put('C', 123);
        symbolToCount.remove('C');

        ArrayList<Character> symbols = new ArrayList<>();
        symbols.trimToSize();

    }
}
