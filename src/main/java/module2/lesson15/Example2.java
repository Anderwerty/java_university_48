package module2.lesson15;

public class Example2 {
    public static void main(String[] args) {
        User.Address address = new User().new Address();
    }
}

class User {
    private static String userStatic = "";
    private String firstName;
    private String lastName;
    private Address address;

    public User(){
        System.out.println(Address.addressStatic);
    }

    class Address {
         private static String addressStatic = "";

        public Address() {
            System.out.println(userStatic);
            System.out.println(firstName);
        }

        private String city;
        private String street;
        private int number;
    }

    public String getFullAddress() {
        return String.format("City: %s, street: %s, house %d",
                address.city, address.street, address.number);
    }
}
