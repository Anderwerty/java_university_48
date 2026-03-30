package module2.lesson18;

import java.lang.annotation.ElementType;

public class Example1 {
    public static void main(String[] args) {
        ElementType method = null;
        System.out.println(method.TYPE);
        method.values();

        System.out.println(ElementType.class.getSuperclass().getName());
    }
}

abstract class Animal {
     void voice(){}
}

@MyAnnotation
class Dog extends Animal {

    @MyAnnotation
    @Deprecated
    @Override
    void voice() {

    }
}