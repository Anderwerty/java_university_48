package module1.lesson27;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Example6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2026, Month.FEBRUARY, 12);
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2026, 1, 12);
        System.out.println(localDate2);
        System.out.println(localDate1.getEra());
        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());

        LocalDate minusDays = localDate1.minusDays(13);
        System.out.println(localDate1);
        System.out.println(minusDays);

        LocalTime timeNow = LocalTime.now();
        LocalTime localTime = LocalTime.of(12, 13, 14);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());

        LocalTime minusHours = localTime.plusHours(1);

    }
}
