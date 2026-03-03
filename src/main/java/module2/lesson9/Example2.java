package module2.lesson9;

public class Example2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Weight weight = new Weight(10);
        String name = "Cat"; // string pool
        Animal cat = new Animal(name, weight);
        Animal clone = cat.clone();
        Animal clone2 = clone.clone();

        System.out.println(clone);

        System.out.println(cat == clone);
        System.out.println(cat.getName() == clone.getName());
        System.out.println(cat.getWeight() == clone.getWeight());

        System.out.println(clone2 == clone);
        System.out.println(clone2.getName() == clone.getName());
        System.out.println(clone2.getWeight() == clone.getWeight());


    }
}

class Animal /*implements Cloneable*/ {
    private final String name;
    private  Weight weight;

    public Animal(String name, Weight weight) {
        System.out.println("Animal constructor");
        this.name = name;
        this.weight = weight;
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        Animal clone =(Animal) super.clone();
        clone.weight = this.weight ==null? null: this.weight.clone();
        return  clone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", weight " + weight.getValue();
    }

    public String getName() {
        return name;
    }

    public Weight getWeight() {
        return weight;
    }
}

class Weight implements Cloneable {
    private final int value;

    public Weight(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Weight clone() throws CloneNotSupportedException {
        return (Weight) super.clone();
    }
}
