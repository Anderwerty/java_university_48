package module1.lesson4;

public class Example15 {
    public static void main(String[] args) {
        int temperature = 9;
        String message = (temperature > 20) ?
                "одягнути сорочку" :
                (temperature > 10) ? "одягнути светр" :
                        ((temperature > 0) ? "одягнути плащ" : "одягнути пальто");
        System.out.println(message);

    }

}
