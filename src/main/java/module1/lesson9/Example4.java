package module1.lesson9;

public class Example4 {
    public static void main(String[] args) {

    }

    public static int findMin(int a, int b) {
        return a > b ? b : a;
    }

    public static int findMin2(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
