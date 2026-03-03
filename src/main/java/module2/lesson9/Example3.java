package module2.lesson9;

import java.util.UUID;

public class Example3 {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        new MyFinalizedClass(uuid);
        long l = 0;
        for (int i = 0; i < 1_000_000; i++) {
            l++;
        }
        System.gc();
        System.gc();
        System.gc();
        System.out.println(uuid);
    }
}

class MyFinalizedClass {

    private final String uuid;

    MyFinalizedClass(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Is deleted: " + uuid);
        System.out.println("close resources ...");
    }
}
