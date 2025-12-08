package module1.lesson17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(14);
        numbers.add(4);

        System.out.println(numbers);
//        for (Integer number : numbers) {
//            if(number<0){
//                numbers.remove(number);
//            }
//        }
//        System.out.println(numbers);


//        Iterator<Integer> iterator = numbers.iterator();
//        for (;iterator.hasNext();) {
//            Integer number = iterator.next();
//            if(number<0){
//                numbers.remove(number);
//            }
//        }

        Iterator<Integer> iterator = numbers.iterator();
        for (;iterator.hasNext();) {
            Integer number = iterator.next();
            if(number<0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
