package module1.lesson3;

public class Example1 {
    public static void main(String[] args) {
        byte b = 10;
        byte a = 10;
        int c = a + b;

        b++;
        System.out.println(b);

       // b=b+1;
        c=c+1;

        b+=1; // b=b+1
    }
}
