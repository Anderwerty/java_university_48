package module1.lesson4;

public class Example17 {
    public static void main(String[] args) {
        String str1 = "Hello"; // string pool
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println("============");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
