package module1.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        HashMap<User, String> userToPassword = new HashMap<>();

        User alex = new User("Alex");
        userToPassword.put(alex, "password12");
//        userToPassword.put(new User("Alex"), "passwordabc");
//
//        System.out.println(userToPassword.get(new User("Alex")));
//        System.out.println(userToPassword.get(alex));

        System.out.println(userToPassword.size());

        alex.setName("Petro");

        System.out.println(userToPassword.get(alex));

        Set<Map.Entry<User, String>> entries = userToPassword.entrySet();

        for (Map.Entry<User, String> entry : entries) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }

        if(object.getClass()!=this.getClass()){
            return false;
        }

        User that = (User)object;

        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }

    @Override
    public String toString(){
        return "User with name "+name;
    }
}
