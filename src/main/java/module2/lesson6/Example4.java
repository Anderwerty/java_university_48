package module2.lesson6;

import java.util.Comparator;

public class Example4 {
    public static void main(String[] args) {
        Comparator<User> comparator = (user1, user2) ->
                user1.getName().length() - user2.getName().length();
        // user1.compareTo(user2);

        Comparable<User> comparable = (user) -> 0;

    }
}

class User implements Comparable<User> {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User that) {
        return this.name.length() - that.name.length();
    }
}
