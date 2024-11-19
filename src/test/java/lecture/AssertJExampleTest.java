package lecture;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJExampleTest {

    @Test
    public void testAddTwoNumbers() {
        // Given
        int result = 1 + 3;

        // Then
        Assertions.assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isLessThan(6)
                .isGreaterThan(3)
                .isBetween(0, 10);
    }
}
