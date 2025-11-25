package module1.lesson13;

public class Example3 {
    public static void main(String[] args) {
        Order order1 = new Order("1234A");
        order1.setName("Order for Andrii");

        Order order2 = new Order("NEW order","1456B");
    }
}

class Order {
    private String number;
    private String name;

    public Order(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Order(String number) {
        this.number = number;
        this.name = "NO NAME";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
