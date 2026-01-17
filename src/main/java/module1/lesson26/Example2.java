package module1.lesson26;

public class Example2 {
    public static void main(String[] args) {
        //0!=1
        //1!=1
        //2!=1*2=2
        //3!=1*2*3=6
        //4!=1*2*3*4=24
        //5!=1*2*3*4*5=120=4! * 5
        //...
        //n!=1*2*3*4*5*....*(n-1)*n=(n-1)!*n

        System.out.println(factorialWithLoop(0));
        System.out.println(factorialWithLoop(1));
        System.out.println(factorialWithLoop(2));
        System.out.println(factorialWithLoop(3));
        System.out.println(factorialWithLoop(4));

        System.out.println("====");
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));


    }

    // implementation for factorial with loop
    public static int factorialWithLoop(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n is negative");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; //  result = result * i;
        }

        return result;
    }

    //n! = (n-1)!*n
    //factorial(n)=factorial(n-1)*n
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n is negative");
        }
        return n == 0 ? 1 : factorial(n - 1) * n;
    }

    //factorial(2)=factorial(1)*2=factorial(0)*1*2=1*1*2
}
