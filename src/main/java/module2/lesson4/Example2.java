package module2.lesson4;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        Swimmable swimmable1 = new SwimmableImpl();
        Swimmable swimmable2 = new Swimmable2Impl();

        List<Swimmable> items = List.of(swimmable1, swimmable2);

        for (Swimmable item : items) {
            item.swim();
        }
    }
}

interface Swimmable {
    void swim();
}

abstract class AbstractSwimmableImpl implements Swimmable{

}

class SwimmableImpl implements Swimmable{

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}

class Swimmable2Impl implements Swimmable{

    @Override
    public void swim() {
        System.out.println("I'm swimming very fast");
    }
}
