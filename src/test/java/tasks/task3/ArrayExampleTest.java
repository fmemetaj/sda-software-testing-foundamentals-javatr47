package tasks.task3;

import org.fmemetaj.tasks.task3.ArrayExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExampleTest {

    @Test
    public void testRemoveDuplicates() {
        // Given
        String[] array = {"a", "a", "b"};

        // When
        String[] result = ArrayExample.removeDuplicates(array);

        // Then
        Assertions.assertArrayEquals(new String[]{"a", "b"}, result);
    }
}
