package module1.lesson4_5;

public class Example10 {
    public static void main(String[] args) {
        int temperature = -5;
//         NOT !, !true --> false, !false --> true
        if (temperature >= 0) {//!(temperature < 0) --> temperature>=0
            System.out.println("Тепло");
        } else {
            System.out.println("На вулиці мороз");
            System.out.println("Шапку одягни");
        }
    }
}
