package module1.lesson25;

public class Example3 {
    public static void main(String[] args) {
        PizzaStart pizza = new PizzaStart();

        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese(pizza);
        PizzaWithSalami pizzaWithCheeseAndSalami = new PizzaWithSalami(pizzaWithCheese);
        PizzaWithCheese pizzaWithCheeseAndSalamiAndCheese = new PizzaWithCheese(pizzaWithCheeseAndSalami);

        pizzaWithCheeseAndSalamiAndCheese.cook();


        System.out.println("===================================");
        new PizzaWithCheese(new PizzaWithSalami(new PizzaWithCheese(new PizzaStart()))).cook();

    }
}

interface IPizza {
    void cook();

}

class PizzaStart implements IPizza {

    @Override
    public void cook() {
        System.out.println("створити кож");
    }
}

class PizzaWithCheese implements IPizza {
    private final IPizza pizza;

    PizzaWithCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
        System.out.println("добавимо сира");
    }
}

class PizzaWithSalami implements IPizza {
    private final IPizza pizza;

    PizzaWithSalami(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
        System.out.println("додамо ковбаски");
    }
}
