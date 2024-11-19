package lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnitExampleTest {

    @ParameterizedTest
    @ValueSource(strings = {"Testing", "JUnit", "SDA"})
    public void testIfValueSourceIsNotNull(String word) {
        Assertions.assertNotNull(word);
    }
}
