package lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testNotNull() {
        // Given
        String text = "SDA";

        // Then
        Assertions.assertNotNull(text);
    }

    @Test
    public void testNull() {
        // Given
        String text = null;

        // Then
        Assertions.assertNull(text);
    }

    @Test
    public void testTrue() {
        // Given
        boolean result = true;

        // Then
        Assertions.assertTrue(result);
    }

    @Test
    public void testFalse() {
        // Given
        boolean result = false;

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    public void testArrayEquals() {
        // Given
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};

        // Then
        Assertions.assertArrayEquals(array1, array2);
    }
}
