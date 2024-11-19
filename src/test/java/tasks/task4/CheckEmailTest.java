package tasks.task4;

import org.fmemetaj.tasks.task4.CheckEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckEmailTest {
    @Test
    public void checkEmail() {
        //Given
        String email = "test@gmail.com";
        //When
        boolean result = CheckEmail.checkEmail(email);
        //Then
        Assertions.assertTrue(result);
    }
}
