package module1.lesson17;

import java.util.HashSet;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        HashSet<Integer> items = new HashSet<>();
        items.add(1);
        items.add(1);
        items.add(2);
        System.out.println(items.size()); // 2

        System.out.println("====");
        HashSet<User> users = new HashSet<>();
        users.add(new User("Pavlo"));
        users.add(new User("Pavlo"));
        User andrii = new User("Andrii");
        users.add(andrii);
        users.add(andrii);
        System.out.println(users.size()); //2

        users.remove(andrii);

        System.out.println(users.size());
        users.clear();

        System.out.println(users.size());

    }
}

 class User {
    private String name;

    public User(String name){
        this.name= name;
    }

    @Override
    public boolean equals(Object object){
        if(object == null ){
            return false;
        }

        if(object.getClass()!=getClass()){
            return false;
        }

        User that = (User)object;

        return Objects.equals(this.name, that.name);
    }

    @Override
     public int hashCode(){
        return Objects.hashCode(name);
    }
 }
