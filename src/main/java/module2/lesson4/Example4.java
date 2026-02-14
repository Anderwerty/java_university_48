package module2.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        SymbolCounterExecutor executor
                = new SymbolCounterExecutor();

        List<Integer> integers =
                executor.executeBatch(Arrays.asList("One", "hello", "a", ""));

        System.out.println(integers);
    }
}

interface Executable<I, O> {
    O execute(I item);

    default List<O> executeBatch(List<I> items) {
        List<O> results = new ArrayList<>();

        for (I item : items) {
            results.add(execute(item));
        }

        return results;
    }
}

class SymbolCounterExecutor implements Executable<String, Integer> {

    @Override
    public Integer execute(String item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        return item.length(); // int -> wrap into Integer
    }
}
