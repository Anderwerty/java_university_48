package module1.lesson21;

public class Example10 {
    public static void main(String[] args) throws BCheckedException, CCheckedException, DCheckedException {
        int value = 0;

//        try {
//            validate2(value);
//        } catch (CCheckedException e) {
//            System.out.println("CCheckedException: " + e);
//        } catch (DCheckedException e){
//            System.out.println("DCheckedException: " + e);
//        } catch (BCheckedException e){
//            System.out.println("BCheckedException: " + e);
//        }



        try {
            validate2(value);
        } catch (CCheckedException|DCheckedException e) {
            System.out.println("Exception: " + e);
        } catch (BCheckedException e){
            System.out.println("BCheckedException: " + e);
        }

//        try {
//            validate2(value);
//        } catch (CCheckedException|DCheckedException|BCheckedException e) {
//            System.out.println("Exception: " + e);
//        }


    }

    private static void validate2(int value) throws BCheckedException {
        if (value == 0) {
            throw new DCheckedException();
        }

        if (value == 1) {
            throw new CCheckedException();
        }

        if (value == 2) {
            throw new BCheckedException();
        }
    }

    private static void validate1(int value) throws DCheckedException, CCheckedException {
        if (value == 0) {
            throw new DCheckedException();
        }

        if (value == 1) {
            throw new CCheckedException();
        }
    }
}

class ACheckedException extends Exception {
}

class BCheckedException extends ACheckedException {
}

class CCheckedException extends BCheckedException {
}

class DCheckedException extends BCheckedException {
}
