package module1.lesson17;

import java.util.Iterator;

public class Example4 {
    public static void main(String[] args) {
        Container<Integer> integerContainer =
                new Container<>(100);

        for (int i = 0; i < 10; i++) {
            integerContainer.add(i);
        }

        System.out.println("=========");
        for (var item: integerContainer){
            System.out.println(item);
        }
    }
}

class Container<E> implements Iterable<E> {
    private Object[] items;
    private int currentIndex = 0;

    public Container(int capacity) {
        items = new Object[capacity];
    }

    public void add(E element) {
        this.items[currentIndex++] = element;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            private int iterationIndex = 0;
            @Override
            public boolean hasNext() {
                return iterationIndex< currentIndex;
            }

            @Override
            public E next() {
                return (E) items[iterationIndex++];
            }
        };
    }
}
