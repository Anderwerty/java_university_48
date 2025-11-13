package module1.lesson10;

public class Example7 {
    public static void main(String[] args) {
        String message = "Methods from class String";

        System.out.println("length()");
        System.out.println(message.length());
        System.out.println("isEmpty()");
        System.out.println(message.isEmpty());
        System.out.println("".isEmpty());
        System.out.println("isBlank()");

        System.out.println(message.isBlank());
        System.out.println("".isBlank());
        System.out.println("\t".isBlank());

        System.out.println("trim()");
        System.out.println(message.trim());
        System.out.println("              1 ".trim());
        System.out.println("              1 ".trim().length());

        System.out.println("charAt(int)");
        System.out.println("01234a".charAt(0));
        System.out.println("01234a".charAt(1));
        System.out.println("01234a".charAt(5));
//        System.out.println("01234a".charAt(50)); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException

        System.out.println("toCharArray()");
        char[] charArray = "012345a".toCharArray();
        System.out.println(charArray.length);
        System.out.println(charArray[6]);

        // HW: implement reverceString: hello --> olleh

        System.out.println("getBytes()");

        System.out.println("abc".getBytes().length);

        System.out.println("split(String)");
        String[] words = message.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("join(..)");
        String joinedResult = String.join("__", words);
        System.out.println(joinedResult);

    }

    public static String reverceString(String original){
        return original;
    }
}
