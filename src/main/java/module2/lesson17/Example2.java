package module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<B> bClass = B.class;

        Field staticField = bClass.getDeclaredField("staticValue");
        staticField.setAccessible(true);
        staticField.setInt(null, 321);

        Method getStaticValue = bClass.getDeclaredMethod("getStaticValue");
        getStaticValue.setAccessible(true);
        System.out.println(getStaticValue.invoke(null));

        Class<Integer> integerClass = int.class;
        Class<Integer> integerClass1 = Integer.class;
        System.out.println(integerClass1==integerClass);
        System.out.println(integerClass1.equals(integerClass));
        Constructor<B> declaredConstructor = bClass.getDeclaredConstructor(integerClass);
        declaredConstructor.setAccessible(true);
        B b = declaredConstructor.newInstance(1234);

        System.out.println(bClass.isAnnotation());
        System.out.println(bClass.isInterface());



    }
}

class B {

    private static int staticValue;
    private final int value;

    private B(int value) {
        System.out.println("private constructor ");
        this.value = value;
    }

    private int getValue(){
        System.out.println("private setter");
       return value;
    }

    private static int getStaticValue(){
        System.out.println("private static method");
        return staticValue;
    }
}
