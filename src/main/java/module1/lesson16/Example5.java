package module1.lesson16;

public class Example5 {
    public static void main(String[] args) {
        // problem
        ContainerInt containerInt = new ContainerInt(1);
        int intValue = containerInt.getValue();
        System.out.println(intValue);


        ContainerString containerString = new ContainerString("String");
        String stringValue = containerString.getValue();
        System.out.println(stringValue);

        // how to solve. Option 0
        ContainerObject containerObject = new ContainerObject("1");
        Integer value = (Integer) containerObject.getValue();
        System.out.println(value);

        // solution
        Container<String> container = new Container<>("text");
        String value1 = container.getValue();

        Container container2 = new Container(1);
        Object value2 = container2.getValue();
    }
}

class ContainerInt {
    private int value;

    public ContainerInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class ContainerString {
    private String value;

    public ContainerString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class ContainerBoolean {
    private Boolean value;

    public ContainerBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }
}

class ContainerObject {
    private Object value;

    public ContainerObject(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

class Container<T> {
    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

