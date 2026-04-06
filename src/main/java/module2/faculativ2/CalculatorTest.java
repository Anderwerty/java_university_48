package module2.faculativ2;

import static module2.faculativ2.Assertion.assertEquals;
import static module2.faculativ2.Assertion.assertThrow;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldFailed() {
        int actual = calculator.add(1, 3);
        int expected = 40;
        assertEquals(actual, expected, "Sum return incorrect value");
    }

    @Test
    void shouldReturnSum() {
        int actual = calculator.add(1, 3);
        int expected = 4;
        assertEquals(actual, expected, "Sum return incorrect value");
    }

    @Test
    void shouldReturnDifference() {
        int actual = calculator.minus(1, 4);
        int expected = -3;
        assertEquals(actual, expected, "Minus return incorrect value");
    }

    @Test
    void shouldThrowException() {
        assertThrow(RuntimeException.class, () -> {
            throw new IllegalArgumentException();
        });
    }

    @Timeout(time = 4)
    @Test
    void withoutTimeOut() throws InterruptedException {
        Thread.sleep(1_000);
    }

    @Timeout(time = 1)
    @Test
    void withTimeOut() throws InterruptedException {
        Thread.sleep(4_000);
    }
}
