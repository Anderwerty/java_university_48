package module2.lesson18;

import java.lang.annotation.Inherited;

public class Example3 {
    public static void main(String[] args) {
        print("hello");
    }

    @SafeVarargs
    public Example3(String ... args){
        System.out.println(args);
    }

    @SuppressWarnings("java:S106")
    private static void print(String message){
        System.out.println("hello");
    }
}

@Deprecated(since ="1.20.0", forRemoval = true)
class Car{
    public void drive(){}
}
class SuperCar extends Car{
    @Override
    public void drive(){

    }
}

//@Inherited
@FunctionalInterface
interface MyFunction{
    int convert(String value);
}
