package module1.lesson20;

public class Example5 {
    public static void main(String[] args) {
        Object obj = "1";

        // before java 16
        if (obj instanceof Integer) {
            Integer item = (Integer) obj;
            System.out.println(item.intValue());
        }

        // with java 16
        if (obj instanceof Integer item2) {
            System.out.println(item2.intValue());
        }

        System.out.println(isWorkingDay3(null));

    }


    public static String asStringValue(Object object) {
        String result = "n/a";

        if (object instanceof String str) {
            result = str;
        } else if (object instanceof Integer intValue) {
            result = intValue.toString();
        }

        return result;
    }

    public static String asString2(Object object) {
        return switch (object) {
            case String str -> str;
            case Integer intValue -> intValue.toString();
            default -> "n/a";
        };
    }

    public static boolean isWorkingDay(Days day) {
        boolean isWorking = false;
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                isWorking = true;
                break;
            case SATURDAY:
            case SUNDAY:
                isWorking = false;
                break;
        }
        return isWorking;
    }

    public static boolean isWorkingDay2(Days day) {
        var isWorking = false;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> isWorking = true;
            case SATURDAY, SUNDAY -> isWorking = false;
        }
        return isWorking;
    }

    public static boolean isWorkingDay3(Days day) {
        return switch (day) {
            case SATURDAY, SUNDAY -> false;
            case null, default -> true;
        };
    }

    public static boolean isWorkingDay4(Days day) {
        return switch (day) {
            case SATURDAY:
            case SUNDAY:
                yield false;
            default:
                yield true;
        };
    }
}
