package module1.lesson10;

public class Example1 {
    public static void main(String[] args) {
        final int a = 10;
        final String name = "Andrii";
        final int[] items = {1, 2, 3};

        System.out.println(a);

        //a++;
        //a=100;
        //name ="Ivan";
        //items = new int[] {};
        items[0] = 100_000;
        System.out.println(a);
        System.out.println(items[0]);
    }
}
