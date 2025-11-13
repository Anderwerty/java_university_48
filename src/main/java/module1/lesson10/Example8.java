package module1.lesson10;

public class Example8 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        String c = "HeLlO";

        System.out.println("equals()");
        System.out.println(a.equals(b));

        System.out.println("equalsIgnoreCase()");
        System.out.println(a.equalsIgnoreCase(c));

        System.out.println("compareTo()");
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("A"));
        System.out.println("a".compareToIgnoreCase("A"));

        System.out.println("Not name".startsWith("Not"));
        System.out.println("Not name".endsWith("me"));
//        "".regionMatches()



    }
}
