package module2.lesson6.optional;

import java.util.function.Function;

public class Example7 {
    private static final String DEFAULT_CITY_NAME = "X";

    public static void main(String[] args) {
        Client client = new Client(new Address(new City("Kyiv")));
        Client client2 = new Client(new Address(new City(null)));
        Client client3 = new Client(new Address(null));
        Client client4 = new Client(null);
        Client client5 = null;
        // return client.getAddress().getCity().getName();

        String cityName = Optional.ofNullable(client5)//
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .orElse(DEFAULT_CITY_NAME);

        String cityName2 = java.util.Optional.ofNullable(client5)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .orElse(DEFAULT_CITY_NAME);

        System.out.println(cityName);
        System.out.println(cityName2);
    }


    private static String getClientCityName(Client client) {
        // return client.getAddress().getCity().getName();
        if (client == null) {
            return DEFAULT_CITY_NAME;
        }
        Address address = client.getAddress();
        if (address == null) {
            return DEFAULT_CITY_NAME;
        }
        City city = address.getCity();
        if (city == null) {
            return DEFAULT_CITY_NAME;
        }
        return city.getName();
    }
}

class Optional<T> {

    private static final Optional EMPTY = new Optional<>(null);

    private final T value;

    private Optional(T value) {
        this.value = value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public <R> Optional<R> map(Function<T, R> mapper) {
        return isPresent() ?
                Optional.ofNullable(mapper.apply(value)) :
                EMPTY;
    }

    public T getValue() {
        if (value == null) {
            throw new RuntimeException();
        }
        return value;
    }

    public T orElse(T defaultValue) {
        return isPresent() ? value : defaultValue;
    }

    public static <E> Optional<E> ofNullable(E value) {
        return (value == null) ? EMPTY : new Optional<>(value);
    }

}

class Client {
    private final Address address;

    Client(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private final City city;

    Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}

class City {
    private final String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
