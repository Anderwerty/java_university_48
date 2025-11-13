package module1.lesson9;

public class Example10 {
    public static void main(String[] args) {
       int value = 100;
        System.out.println(value);
        method(value);
        System.out.println(value);
    }

    private static void method(int a){
        a++;
    }
}
