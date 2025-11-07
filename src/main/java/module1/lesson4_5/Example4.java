package module1.lesson4_5;

public class Example4 {
    public static void main(String[] args) {
        int a1 = 0;
        boolean result1 = true || ++a1 == 1;

        System.out.println(result1);//true
        System.out.println(a1);//0

        int a2 = 0;
        boolean result2 = true | ++a2 == 1;

        System.out.println(result2);//true
        System.out.println(a2);//1
    }
}
