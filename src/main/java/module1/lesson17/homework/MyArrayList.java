package module1.lesson17.homework;

public class MyArrayList<T> implements List<T> {

    private int size = 0;

    private Object[] items;
    @Override
    public int size() {
        // put your implementation here
        return size;
    }

    @Override
    public void add(T element) {
        // put your implementation here

        items[size++]=element;
    }

    @Override
    public void addByIndex(T element, int index) {
        // put your implementation here

    }

    @Override
    public T getByIndex(int index) {
        // put your implementation here

        return null;
    }

    @Override
    public T removeByIndex(int index) {
        // put your implementation here
        return null;
    }

    @Override
    public void clear() {
        // put your implementation here

    }
}
