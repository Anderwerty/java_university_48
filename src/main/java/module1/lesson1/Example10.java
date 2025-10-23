package module1.lesson1;

public class Example10 {
    public static void main(String[] args) {
        int a =10;
        int b =21;
        //10+"+"+21+"="+(10+21)
        //10+"+"+21+"="+31
        //"10+"+21+"="+31
        //"10+21"+"="+31
        //"10+21="+31
        //"10+21=31"

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(b+"/"+a+"="+(b/a));
        System.out.println(a+"/"+b+"="+(a/b));
//        System.out.println(a/0);  //java.lang.ArithmeticException: / by zero
        //b =21, a= 10
        System.out.println(b+"%"+a+"="+(b%a)); //1
        System.out.println(a+"%"+b+"="+(a%b)); //10

        System.out.println((a%2)==0);
    }
}
