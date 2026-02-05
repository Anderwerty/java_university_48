package module1.lesson27;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        currentDate.setTime(1_000_000);
        System.out.println(currentDate);

        Date date2 = new Date(1_000_000_000_000L);
        System.out.println(date2);


    }
}
