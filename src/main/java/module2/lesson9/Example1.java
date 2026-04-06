package module2.lesson9;

import java.util.Objects;

public class Example1 {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        //module2.lesson9.Example2@6acbcfc0
        System.out.println(example1.toString());
        Client alex = new Client("Alex");
        System.out.println(alex);
    }
}

class Client {
    private final String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client with name: " + name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        Client that = (Client) o;

        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
