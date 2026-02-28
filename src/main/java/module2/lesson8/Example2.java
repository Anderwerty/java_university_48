package module2.lesson8;

public class Example2 {
    public static void main(String[] args) {
        new FirstClass("Taras");
    }
}

class FirstClass {
    private String name = "0";

    {
        System.out.println("no-static block start: " + name);
        this.name = "1";
        System.out.println("no-static block end: " + name);
    }

    public FirstClass(String name) {
        System.out.println("constructor start: " + this.name);
        this.name = name;
        System.out.println("constructor end:" + this.name);

    }
}
