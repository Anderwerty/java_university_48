package module1.lesson20;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.name());
        System.out.println(Day.MONDAY.ordinal());

        System.out.println(Day.WEDNESDAY.name());
        System.out.println(Day.WEDNESDAY.ordinal());

        System.out.println("==========");
        for (Day value : Day.values()) {
            System.out.println(value.name());
        }
        System.out.println("=".repeat(100));

        System.out.println(Day.valueOf("monday"));
        System.out.println(Day.valueOf("MONDAY"));
    }
}

class Day {
    public static final Day MONDAY = new Day(0, "MONDAY");
    public static final Day TUESDAY = new Day(1, "TUESDAY");
    public static final Day WEDNESDAY = new Day(2, "WEDNESDAY");
    public static final Day THURSDAY = new Day(3, "THURSDAY");
    public static final Day FRIDAY = new Day(4, "FRIDAY");
    public static final Day SATURDAY = new Day(5, "SATURDAY");
    public static final Day SUNDAY = new Day(6, "SUNDAY");

    private static final Day[] values = {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

    public static Day[] values() {
        return values;
    }

    public static Day valueOf(String name) {
        for (Day value : values) {
            if (value.name().equals(name)) {
                return value;
            }
        }

        return null;
    }

    private final int ordinal;
    private final String name;

    private Day(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int ordinal() {
        return ordinal;
    }

    public String name() {
        return name;
    }
}