package module2.lesson15;

public class Example4 {
    public static void main(String[] args) {
        Animal animal = Animal.builder()
                .withName("animal")
                .build();

        Dog dog = Dog.builder()
                .withWeight(10)
                .withName("Dog")
                .build();
    }
}

class Animal {
    private final String name;


    protected Animal(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder<SELF extends Builder<SELF>> {
        private String name;

        protected Builder() {

        }

        public SELF withName(String name) {
            this.name = name;
            return self();
        }

        @SuppressWarnings("unchecked")
        public SELF self() {
            return (SELF) this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

}

class Dog extends Animal {
    private final int weight;

    protected Dog(Builder builder) {
        super(builder);
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder extends Animal.Builder<Builder> {
        private int weight;

        protected Builder() {

        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Dog build() {
            return new Dog(this);
        }
    }
}

//class Labrador extends Dog {
//    private final int value;
//
//    protected Labrador(Builder builder) {
//        super(builder);
//        this.value = builder.value;
//    }
//
//
//    public static class Builder extends Dog.Builder<Builder> {
//        private int value;
//
//        protected Builder(){
//
//        }
//
//    }
//}
