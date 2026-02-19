package module2.lesson5;

public class Example2 {
    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>(123);
        Integer integerValue = integerContainer.getValue();
        System.out.println(integerValue);

        Container<Integer> integerContainer2 = new Container<>(321);
        Integer integerValue2 = integerContainer2.getValue();
        System.out.println(integerValue2);

        Container<Double> doubleContainer = new Container<>(10.0);
        Double doubleValue = doubleContainer.getValue();
        System.out.println(doubleValue);


        //int compareInt = integerContainer.compareTo(integerContainer2);
        int compareInt = integerContainer2.compareTo(integerContainer);

        System.out.println(compareInt);

        int result = integerContainer2.compareTo(doubleContainer);

    }
}

// =, ==
// int+, String+
class Container<T extends Number> implements Comparable<Container<? extends Number>> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

//    @Override
//    public int compareTo(Container<T> that) {
//        return this.value.intValue() - that.value.intValue();
//    }

    @Override
    public int compareTo(Container<? extends Number> that) {
        return this.value.intValue() - that.value.intValue();
    }
}
