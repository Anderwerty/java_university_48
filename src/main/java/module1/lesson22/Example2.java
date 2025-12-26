package module1.lesson22;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("Start");
        method2();
    }


    private static void method2(){
        System.out.println("method2");
        method3(1);
    }
    private static int method3(int value){
        System.out.println("....");

        boolean isWorking = true;
        IllegalArgumentException exception = new IllegalArgumentException(); // bad idea
        if (!isWorking){

            throw exception; // throw new IllegalArgumentException(); //!!!
        }

        boolean isBad = true;

        if(isBad){
            throw exception;
        }

        return 0;
    }
}
