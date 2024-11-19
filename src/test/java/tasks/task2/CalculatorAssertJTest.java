package tasks.task2;

import org.assertj.core.api.Assertions;
import org.fmemetaj.tasks.task2.CalculatorAssertJ;
import org.junit.jupiter.api.Test;

public class CalculatorAssertJTest {

    @Test
    public void testAdd() {
        // Given
        CalculatorAssertJ calculator = new CalculatorAssertJ();

        // When
        int result = calculator.add(1, 2);

        // Then
        Assertions.assertThat(result)
                .isEqualTo(3);
    }
}
