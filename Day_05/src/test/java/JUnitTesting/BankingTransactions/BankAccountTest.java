package JUnitTesting.BankingTransactions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        account.deposit(300);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(500));
        assertEquals("Insufficient funds or invalid amount", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

}