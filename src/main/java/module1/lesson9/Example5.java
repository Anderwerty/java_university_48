package module1.lesson9;

public class Example5 {
    public static void main(String[] args) {
        int item = 7;
        int[] items1 = {1, 3, 6, 0, 7, 0, 1, 3, 5, 8, 9, 9, 0};
        int[] items2 = {1, 3, 6, 0, 77, 0, 1, 3, 5, 8, 9, 9, 0};

        System.out.println("isExist");
        System.out.println(isExist(items1, item));
        System.out.println(isExist(items2, item));

        System.out.println("========");
        System.out.println("isExist2");
        System.out.println(isExist2(items1, item));
        System.out.println(isExist2(items2, item));


    }

    // items not null
    // {1, 3, 6, 0, 7, 0, 1, 3, 5, 8, 9, 9, 0}   6?

    public static boolean isExist(int[] items, int item) {
        boolean exist = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                exist = true;
                break;
            }
        }

        return exist;
    }

    public static boolean isExist2(int[] items, int item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return true;
            }
        }

        return false;
    }
}
