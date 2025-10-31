package module1.lesson4;

public class Example18 {
    public static void main(String[] args) {
        String email1 = "ANDRII@gmail.com";
        String email2 = "andrii@gmail.com";
        System.out.println("raw emails: " + email1.equals(email2));

        String em1 = email1.toLowerCase();
        String em2 = email2.toLowerCase();

        System.out.println("both to lower case: " + em1.equals(em2));

        System.out.println("Equals ignore case: " + email1.equalsIgnoreCase(email2));
    }
}
