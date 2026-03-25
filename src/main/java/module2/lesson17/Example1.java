package module2.lesson17;

import java.lang.reflect.Field;

public class Example1 {
    public static void main(String[] args) throws NoSuchFieldException,
            IllegalAccessException {
        A a = new A();
        System.out.println(a.getValue());
        Class<? extends A> aClass = a.getClass();
        Field field = aClass.getDeclaredField("value");

        field.setAccessible(true);
        field.setInt(a,123);

        System.out.println(a.getValue());
    }
}

class A {
    private int value;

    public int getValue() {
        return value;
    }
}
