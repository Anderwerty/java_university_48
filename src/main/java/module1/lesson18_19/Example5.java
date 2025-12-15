package module1.lesson18_19;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
//        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i-100, "" + i);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
