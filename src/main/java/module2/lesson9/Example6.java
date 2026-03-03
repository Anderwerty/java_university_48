package module2.lesson9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example6 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Reflection API
        //MyReflection myReflection = new MyReflection();
        Class<MyReflection> myReflectionClass = MyReflection.class;
        Constructor<MyReflection> constructor = myReflectionClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        MyReflection myReflection = constructor.newInstance();
        myReflection.info();
    }
}

class MyReflection {
    private MyReflection() {
        System.out.println("private constructor");
    }

    public void info(){
        System.out.println("info method");
    }
}
