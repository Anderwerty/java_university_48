package module1.lesson4_5;

public class Example5 {
    public static void main(String[] args) {
        int a1 = 0;
        boolean result1 = false && ++a1 == 1;

        System.out.println(result1);//false
        System.out.println(a1);//0

        int a2 = 0;
        boolean result2 = false & ++a2 == 1;

        System.out.println(result2);//false
        System.out.println(a2);//1
    }
}
