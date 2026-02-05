package module2.lesson1;

public class Example1 {
    public static void main(String[] args) {
        Animal cat = new Cat(); //  cat is animal
        cat.say();

        Animal dog = new Dog(); // dog is animal
        dog.say();

        // cat
        // dog

        System.out.println("Animals");
        Animal[] animals = new Animal[]{cat, dog};

        for (Animal animal : animals) {
            animal.say();
        }
    }
}

class Animal {
    public void say() {
        throw new UnsupportedOperationException("");
    }
}

class Cat extends Animal {

    @Override
    public void say() {
        System.out.println("May-may");
    }
}

class Dog extends Animal {

    @Override
    public void say() {
        System.out.println("Gaf-gaf");
    }
}
