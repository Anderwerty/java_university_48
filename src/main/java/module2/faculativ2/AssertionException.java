package module2.faculativ2;

public class AssertionException extends RuntimeException {

    private final Object actual;
    private final Object expected;

    public AssertionException(Object actual, Object expected, String message){
        super(message);
        this.actual = actual;
        this.expected =expected;
    }

    public Object getActual(){
        return actual;
    }

    public Object getExpected(){
        return expected;
    }
}
