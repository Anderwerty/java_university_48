package module2.lesson6;

import java.util.EnumMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
// Functional interface
        OperationExecutor executor2 = (a, b) -> a + b;

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(1, Operation.PLUS, 100));
        System.out.println(calculator.calculate(1, Operation.MULT, 100));
        System.out.println(calculator.calculate(1, Operation.DIV, 100));
        System.out.println(calculator.calculate(1, Operation.MINUS, 100));

        System.out.println("=".repeat(100));

        Map<Operation, OperationExecutor> operationByExecutor = new EnumMap<>(Operation.class);
        operationByExecutor.put(Operation.DIV, (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException();
            }
            return a / b;
        });
        operationByExecutor.put(Operation.MULT, (a, b) -> a * b);
        operationByExecutor.put(Operation.PLUS, (a, b) -> a + b);
        operationByExecutor.put(Operation.MINUS, (a, b) -> a - b);

        // HW 2 add one more operation %
        FlexibleCalculator calculator1 = new FlexibleCalculator(operationByExecutor);
        System.out.println(calculator1.calculate(1, Operation.PLUS, 100));
        System.out.println(calculator1.calculate(1, Operation.MULT, 100));
        System.out.println(calculator1.calculate(1, Operation.DIV, 100));
        System.out.println(calculator1.calculate(1, Operation.MINUS, 100));

    }
}

class Calculator {

    //HW: simplify this implementation
    public int calculate(int a, Operation operation, int b) {
        int result;
        switch (operation) {
            case DIV -> {
                if (b == 0) {
                    throw new IllegalArgumentException("your message");
                }
                result = a / b;
            }
            case MULT -> result = a * b;
            case PLUS -> result = a + b;
            case MINUS -> result = a - b;
            case null, default -> throw new IllegalArgumentException();
        }

        return result;
    }
}

class FlexibleCalculator {

    private final Map<Operation, OperationExecutor> operationByExecutor;

    public FlexibleCalculator(Map<Operation, OperationExecutor> operationByExecutor) {
        this.operationByExecutor = operationByExecutor;
    }

    public int calculate(int a, Operation operation, int b) {
        return operationByExecutor.get(operation).execute(a, b);
    }
}

enum Operation {
    PLUS, MINUS, DIV, MULT
}

