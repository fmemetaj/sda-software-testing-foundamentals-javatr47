package tasks.task5;

import org.fmemetaj.tasks.task5.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testAccountNumberValidation() {
        //Given
        Account account = new Account("11111111111111111111111111",200,"Filani");

        //Then
        Assertions.assertEquals(26,account.getAccountNumber().length());

    }

    @Test
    public void testAmountReceived(){
        //Given
        Account account1 = new Account("11111111111111111111111111",200,"Filani");
        Account account2 = new Account("11111111111111111111111112",300,"Fili");

        //When
        account1.transfer(100,account2);

        //Then
        Assertions.assertEquals(400,account2.getBalance());
    }

    @Test
    public void testAmountSent(){
        //Given
        Account account1 = new Account("11111111111111111111111111",200,"Filani");
        Account account2 = new Account("11111111111111111111111112",300,"Fili");

        //When
        account1.transfer(100,account2);

        //Then
        Assertions.assertEquals(100,account1.getBalance());
    }

    @Test
    public void testAccountFields(){
        //Given
        Account account1 = new Account("11111111111111111111111111",200,"Filani");

        //Then
        Assertions.assertNotNull(account1.getAccountNumber());
        Assertions.assertNotNull(account1.getName());
    }

    @Test
    public void testAmountLessThanBalance(){
        //Given
        Account account1 = new Account("11111111111111111111111111",200,"Filani");

        //When
        int amount = 100;

        //Then
        org.assertj.core.api.Assertions.assertThat(amount)
                .isLessThan((int) account1.getBalance());
    }
}
