package module2.lesson5;

import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Zoo<Tiger> tigerZoo = new Zoo<>(Tiger.class);
        Tiger newAnimal = tigerZoo.createNewAnimal();

    }
}

class Zoo<T> {
    Class<T> clazz;
    ArrayList<T> animals = new ArrayList<>();

    public Zoo(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T createNewAnimal() throws InstantiationException, IllegalAccessException {
        T animal = clazz.newInstance();
        animals.add(animal);
        return animal;
    }
}

class Tiger {
    public Tiger(){
        System.out.println("tiger constructor");
    }
}
