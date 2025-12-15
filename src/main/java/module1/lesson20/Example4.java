package module1.lesson20;

public class Example4 {
    public static void main(String[] args) {
        int value = 2;

        if (value == 0) {
            System.out.println("ZERO");
        } else if (value == 1) {
            System.out.println("ONE");
        } else if (value == 2) {
            System.out.println("TWO");
        } else {
            System.out.println("ELSE");
        }
        System.out.println("========");

        switch (value){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
//                break;
            case 2:
            case 3:
                System.out.println("----");
                System.out.println("TWO OR THREE");
                System.out.println("----");
                break;
            default:
                System.out.println("ELSE");
                break;
        }

    }
}
