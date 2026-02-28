package module2.lesson8;

public class Example6 {
    public static void main(String[] args) throws Exception {
//        new Class6();
        Class7 class7 = new Class7(1);
    }
}

class Class6 {
    {
        boolean isWork = false;
        if (!isWork) {
            throw new RuntimeException();
        }
    }
}

class Class7 {
    {
        boolean isWork = true;
        if (!isWork) {
            throw new Exception();
        }
    }

    public Class7() throws Exception {

    }

    public Class7(int v) throws  Exception{

    }

}
