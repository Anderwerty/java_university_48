package module1.lesson12;

public class Example5 {
    public static void main(String[] args) {
        byte a = (byte) 128;
        System.out.println(a);

        byte ak = 10;
        byte bk = 20;

        byte result = (byte) (ak + bk); // -128 , 127
        System.out.println(result);
    }
}
