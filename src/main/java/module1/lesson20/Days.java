package module1.lesson20;

public enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum Singleton {
    INSTANCE;


}


class Demon{
    public static void main(String[] args) {
        System.out.println(Days.MONDAY.ordinal());
        System.out.println(Days.MONDAY.name());

        Days[] values = Days.values();
        System.out.println(values);
        //Days monday = Days.valueOf("monday");
        Days monday = Days.valueOf("MONDAY");
        System.out.println(monday.toString());
    }
}
