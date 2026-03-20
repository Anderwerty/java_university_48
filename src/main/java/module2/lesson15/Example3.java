package module2.lesson15;

import java.time.LocalDate;

public class Example3 {
    public static void main(String[] args) {
//        Client client = new Client("Taras", "alex@gmail.com",
//                "Shevchenko", LocalDate.now(), "value1");

        Client client = Client.builder()
                .withEmail("taras_shevchenko@gmail.com")
                .withFirstname("Taras")
                .withLastname("Shevchenko")
                .withBirthDate(LocalDate.now())
                .build();


    }
}

class Client {

    private final String firstname;
    private final String lastname;
    private final String email;
    private final LocalDate birthDate;
    private final String value1;
    private final String value2;

    private Client(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.birthDate = builder.birthDate;
        this.value1 = builder.value1;
        this.value2 = builder.value2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String email;
        private LocalDate birthDate;
        private String value1;

        private String value2;

        private Builder() {

        }

        public Builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withValue1(String value1) {
            this.value1 = value1;
            return this;
        }

        public Builder withValue2(String value2) {
            this.value2 = value2;
            return this;
        }

        public Client build() {
            //validation
            return new Client(this);
        }
    }
}
