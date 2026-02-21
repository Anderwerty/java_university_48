package module2.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>(List.of(
                new Address("Kyiv"),
                new Address("Konotop"),
                new Address("Dnipro")));

        Collections.sort(addresses, (a, b) -> a.getCity().length() - b.getCity().length());

        List<Client> clients = Arrays.asList(
                null,
                new Client(null),
                new Client(new Address(null)),
                new Client(new Address("Kyiv")),
                new Client(new Address("Konotop")),
                new Client(new Address("Dnipro")));

        Stream<String> stringStream = clients.stream()
                .filter(client -> client != null)
                .map(client -> client.getAddress())
                .filter(address -> address != null)
                .map(address -> address.getCity())
                .filter(city -> city != null);

        long count =
                //stringStream
                clients.stream()
                .filter(client -> client != null)
                .map(client -> client.getAddress())
                .filter(address -> address != null)
                .map(address -> address.getCity())
                .filter(city -> city != null)
                .count();

        List<String> cities = stringStream
//                clients.stream()
//                .filter(client -> client != null)
//                .map(client -> client.getAddress())
//                .filter(address -> address != null)
//                .map(address -> address.getCity())
//                .filter(city -> city != null)
                .toList();

        System.out.println(count);
        System.out.println(cities);


    }
}

class Client {
    private final Address address;

    public Client(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private final String city;

    Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
