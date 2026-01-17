package module1.lesson27;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example4 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        Date date = new Date(1_000_000_000_000L);
        System.out.println(simpleDateFormat.format(date));

    }
}
