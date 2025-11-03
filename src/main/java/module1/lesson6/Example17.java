package module1.lesson6;

public class Example17 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break outer;
                }
//                if(j>=5){
//                    continue;
//                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
