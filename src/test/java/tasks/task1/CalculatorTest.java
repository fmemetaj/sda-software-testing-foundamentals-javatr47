package tasks.task1;

import org.fmemetaj.tasks.task1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.add(1, 2);

        // Then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.subtract(3, 1);

        // Then
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.multiply(3, 2);

        // Then
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        // Given
        Calculator calculator = new Calculator();

        // When
        double result = calculator.multiply(4, 2);

        // Then
        Assertions.assertEquals(2, result);
    }
}
