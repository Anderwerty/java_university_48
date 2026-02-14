package module2.lesson4;

public class Example1 {
    public static void main(String[] args) {
//        new Animal()
    }
}

abstract class Animal {
    private final String name;

    public Animal() {
        this.name = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void method();
}

class Cat extends Animal {

    public Cat(){
        super();
    }
    @Override
    public void method() {

    }
}

abstract class AbstractCat extends Animal{

}
