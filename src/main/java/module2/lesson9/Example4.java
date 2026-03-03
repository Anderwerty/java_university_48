package module2.lesson9;

public class Example4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Example4 o = new Example4();
        Class<?> aClass = o.getClass();
        Class<?> fromStringName = Class.forName("module2.lesson9.Example4");

        System.out.println(Example4.class == aClass);
        System.out.println(Example4.class == fromStringName);

        System.out.println(Integer.class.getName());
        System.out.println(int.class.getName());

    }
}
