package module1.lesson13;

public class Example1 {
    // HW1: create communication with console
    public static void main(String[] args) {
        System.out.println("create form: ");
        RegistrationForm form = new RegistrationForm();
        form.setAge(10);
        form.setEmail("example@gmail.com");
        form.setLogin("login");
        form.setName("Andrii");
//        form.setLogin("login2");
        System.out.println("=======");
        System.out.println("From form ----> ");
        System.out.println("Login: " + form.getLogin());
        System.out.println("Email: " + form.getEmail());
        System.out.println("Name: " + form.getName());
        System.out.println("Age: " + form.getAge());
    }
}

class RegistrationForm {
    private String login;
    private String name;
    private String email;
    private int age;

    public RegistrationForm() {

    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
