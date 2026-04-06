package module2.faculativ2;

public class Assertion {

    public static void assertEquals(int actual, int expected, String messageIdFailed) {
        if (actual != expected) {
            throw new AssertionException(actual, expected, messageIdFailed);
        }
    }


    public static void assertThrow(Class<? extends Exception> expectedException, Executor executor) {
        try {
            executor.execute();
            throw new AssertionException(expectedException, NoException.class, "");
        } catch (Exception e) {
            if(e.getClass() != expectedException){
                throw new AssertionException(expectedException, e, "");

            }
        }
    }
}

interface Executor {
    void execute() throws Exception;
}
