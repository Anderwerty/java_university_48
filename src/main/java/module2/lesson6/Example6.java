package module2.lesson6;

import java.util.function.Function;
import java.util.function.Supplier;

public class Example6 {
    public static void main(String[] args) {
        Function<String, Integer> textlengthFunction =
                String::length;
        Function<MyString, Integer> function0 =
                (MyString text) -> text.length();

        Function<MyString, Integer> function01 =
                text -> text.length();

        Function<MyString, Integer> function1 =
                (text) -> text.length();

        Function<MyString, Integer> function2 =
                MyString::length;

        Function<MyString, Integer> function3 =
                MyString::length2;

        Supplier<Object> supplier1 = () -> new Object();
        Supplier<Object> supplier2 = Object::new;
    }
}

class MyString {
    private final String text;

    MyString(String text) {
        this.text = text;
    }

    public int length() {
        return text.length();
    }


    public static int length2(MyString text) {
        return text.length();
    }
}
