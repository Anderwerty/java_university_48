package module1.lesson17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> items = new HashSet<>();
        for (int i = 0; i <=10; i++) {
            items.add(i);
        }

        System.out.println(items);

        Iterator<Integer> iterator = items.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===============");
        Iterator<Integer> iterator2 = items.iterator();

        for (; iterator2.hasNext();) {
            System.out.println(iterator2.next());
        }
        System.out.println("=============");

        for(var item: items){
            System.out.println(item);
        }

    }
}
