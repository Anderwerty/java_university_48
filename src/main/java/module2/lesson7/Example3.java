package module2.lesson7;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("switch-case classic");
        System.out.println(getClassic(null));
        System.out.println(getClassic2("Apple"));
        System.out.println(getClassic2("Peach"));
        System.out.println("=".repeat(100));

        System.out.println("switch-case java 14");
        System.out.println(get14Java(null));
        System.out.println(get14Java("blabla"));
        System.out.println("=".repeat(100));

    }


    public static String getClassic(String product) {
        if (product == null) {
            return "other";
        }
        final String productType;

        switch (product) {
            case "Apple":
                System.out.println("....");
                productType = "Fruit";
                break;
            case "Peach":
                productType = "Fruit";
                break;
            case "Raspberry":
                productType = "Berry";
                break;
            default:
                productType = "other";
                break;
        }
        return productType;
    }

    public static String getClassic2(String product) {
        if (product == null) {
            return "other";
        }
        final String productType;

        switch (product) {
            case "Apple":
            case "Peach":
                productType = "Fruit";
                break;
            case "Raspberry":
                productType = "Berry";
                break;
            default:
                productType = "other";
                break;
        }
        return productType;
    }


    public static String get14Java(String product) {
        if (product == null) {
            return "other";
        }

        return switch (product) {
            case "Apple", "Peach" -> {
            System.out.println("...");
            yield  "Fruit";
            }
            case "Raspberry" -> "Berry";
            default -> "other";
        };
    }

    public static String get21Java(String product) {
        return switch (product) {
            case "Apple", "Peach" -> {
                System.out.println("...");
                yield  "Fruit";
            }
            case "Raspberry" -> "Berry";
            case null, default -> "other";
        };
    }


}
