package module1.lesson21;

public class Example11 {
    public static void main(String[] args) {
        calculateWrapping(10);
    }

    public static int calculate(int n) throws Exception {
        if(n<0){
            throw new Exception();
        }

        return 0;
    }

    public static int calculateWrapping(int n){
        try{
            int calculate = calculate(n);
            return calculate;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
