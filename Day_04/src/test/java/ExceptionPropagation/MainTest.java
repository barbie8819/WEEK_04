package ExceptionPropagation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCalculateInterestValid() {
        double interest = Main.calculateInterest(10000, 5, 2);
        assertEquals(1000.0, interest);
    }

    @Test
    public void testNegativeAmountThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateInterest(-1000, 5, 2);
        });
    }

    @Test
    public void testNegativeRateThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateInterest(1000, -5, 2);
        });
    }

}