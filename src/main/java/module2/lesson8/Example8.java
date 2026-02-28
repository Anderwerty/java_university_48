package module2.lesson8;

public class Example8 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.a);
        System.out.println(cat.b);
        System.out.println(cat.c);


        Cat2 cat2 = new Cat2();
        System.out.println(cat2.a);
        System.out.println(cat2.b);
        System.out.println(cat2.c);
    }
}

class Cat {
    public int a = 5;
    public int b = a + 1;
    public int c = a * b;
}

class Cat2 {
    public int a;
    public int b = a + 1;
    public int c = a * b;
}

