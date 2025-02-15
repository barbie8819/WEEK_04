package BankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(500.0);
        account.withdraw(100.0);
        assertEquals(400.0, account.getBalance(), 0.01);
    }

    @Test
    public void testInsufficientBalance() {
        BankAccount account = new BankAccount(200.0);
        assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(300.0);
        });
    }

    @Test
    public void testInvalidAmount() {
        BankAccount account = new BankAccount(300.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        });
    }

}