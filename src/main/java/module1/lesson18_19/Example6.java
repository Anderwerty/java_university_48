package module1.lesson18_19;

import java.util.Comparator;

public class Example6 {
    public static void main(String[] args) {
        Client a = new Client("A");
        Client b = new Client("B");
    }
}

class Client implements Comparable<Client> {
    private final String name;

    public Client(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Client that) {
        return name.compareTo(that.name);
    }
}

class ClientComparator implements Comparator<Client>{
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getName().compareTo(o2.getName());
    }
}