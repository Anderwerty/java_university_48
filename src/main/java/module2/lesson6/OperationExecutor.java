package module2.lesson6;

@FunctionalInterface
public interface OperationExecutor {
    int execute(int a, int b);

    boolean equals(Object obj);

    String toString();

    default void method() {
    }
}
