package module1.lesson27;

import java.util.Date;

// use annotation as an example
@Deprecated(forRemoval = true)
public class Example3 {
    public static void main(String[] args) {
        Date date = new Date(2026 - 1900, 0, 12, 19, 50, 45);
        System.out.println(date);

        System.out.println("year: " + date.getYear());
        System.out.println("month: " + date.getMonth());
        System.out.println("date: " + date.getDate());
        System.out.println("day: " + date.getDay());
        System.out.println("hours: " + date.getHours());
        System.out.println("min: " + date.getMinutes());
        System.out.println("seconds: " + date.getSeconds());
        // we also have setters as pairs for getters
    }
}
