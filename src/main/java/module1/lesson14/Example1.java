package module1.lesson14;

public class Example1 {

    public static void main(String[] args) {
        A.staticValue = 123456;
        // A.noStaticValue = 10;
        A you = new A(); // you
        A yourFriend = new A(); // your friend
        you.noStaticValue = 10;
        //no-static field
        System.out.println(you.noStaticValue);
        System.out.println(yourFriend.noStaticValue);

        // static field
        System.out.println(A.staticValue);

        A a3 = null;
        //System.out.println(a3.noStaticValue);//NPE

        //****
        System.out.println("=================");
        System.out.println(you.staticValue);
        System.out.println(yourFriend.staticValue);

        System.out.println("???????");
        System.out.println(a3.staticValue);
        System.out.println(((A)null).staticValue);
        System.out.println(A.staticValue);
    }
}
