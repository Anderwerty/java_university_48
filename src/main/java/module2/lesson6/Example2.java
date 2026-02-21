package module2.lesson6;

public class Example2 {
    public static void main(String[] args) {
        OperationExecutor executor1 = new OperationExecutorImpl();
        System.out.println(executor1.getClass().getName());

        OperationExecutor executor2 = new OperationExecutor() {
            @Override
            public int execute(int a, int b) {
                return a + b;
            }
        };
        System.out.println(executor2.getClass().getName());

        Object object = new Object(){

        };
        System.out.println(object.getClass().getName());
    }
}

