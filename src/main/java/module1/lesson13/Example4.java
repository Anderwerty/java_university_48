package module1.lesson13;

public class Example4 {
    public static void main(String[] args) {
        Product productA1 = new Product("A", 100);
        Product productA2 = new Product("A", 100);
        Product productA3 = new Product("B", 100);
        Product productA4 = new Product("A", 101);
        Product productA5 = new Product(null, 101);
        Product productA6 = new Product(null, 0);

//        Product productA = null;
        System.out.println(productA1);

        System.out.println(productA1 == productA2);
        System.out.println(productA1.equals(productA2));//true
    }
}

// HW2:
// 1) try to simplify equals

// 2) try to check name first
class Product {
    private String name;
    private int value;

    public Product(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", value: " + value;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }

        if (this.getClass() != that.getClass()) {
            return false;
        }

        Product thatProduct = (Product) that;

        if (this.value != thatProduct.value) {
            return false;
        }

        if (this.name == null && thatProduct.name == null) {
            return true;
        }

        return this.name != null && this.name.equals(thatProduct.name);
    }

    @Override
    public int hashCode() {
        return value + 31 * name.hashCode();
    }

}
