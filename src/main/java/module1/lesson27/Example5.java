package module1.lesson27;

import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.BuddhistCalendar; //bad practice to use package sun.*, better to use java public API

public class Example5 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
       // new BuddhistCalendar();

        GregorianCalendar calendar =
                new GregorianCalendar(2026,1,12);
        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        calendar.set(Calendar.YEAR, 2027);
    }
}
