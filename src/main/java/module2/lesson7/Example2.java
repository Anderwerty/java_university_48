package module2.lesson7;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        Object o = null;
        System.out.println((int[]) o);

        boolean isArray = o instanceof int[];
        System.out.println(isArray);

        Stream<Object> objectStream = Stream.of(1, "Hello", new Object(),
                new int[10], "Kyiv", null);
        List<String> list = objectStream
//                .filter(x -> x != null)
                .filter(Objects::nonNull)
//                .filter(x -> x instanceof String)
                .filter(String.class::isInstance)
//                .map(x -> (String) x)
                .map(String.class::cast)
                .toList();

        System.out.println(list);

    }
}
