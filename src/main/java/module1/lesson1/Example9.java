package module1.lesson1;

public class Example9 {
    public static void main(String[] args) {
        String text = "Hello " + "Dnipro" + "!";
        System.out.println(text);

        int a = 10;
        int b = 27;
        String s = "1";
        String result1 = a + s;
        System.out.println(result1);

        String result2 = a + b + s;// 10+27+s --> 37 +"1" -->"371"
        System.out.println(result2);

        String result3 = s + a + b; // "1"+10+27 --> "110"+27--> "11027"
        System.out.println(result3);

        String result4 = s + (a + b); // "1" +(10+27) --> "1"+37-->"137"
        System.out.println(result4);
    }
}
