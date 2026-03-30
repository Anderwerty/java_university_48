package module2.lesson18;

import lombok.*;

public class Example5 {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAge(10);
        client.isStatus();

    }
}

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Client {
    private int age;

    private boolean status;
}
