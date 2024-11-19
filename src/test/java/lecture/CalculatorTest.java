package lecture;

import org.fmemetaj.lecture.Calculator;
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
}
