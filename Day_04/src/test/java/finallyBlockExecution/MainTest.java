package finallyBlockExecution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testDivisionByZero() {
        try {
            int result = 10 / 0;
            fail("Exception not thrown");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }

    @Test
    public void testValidDivision() {
        int result = 10 / 2;
        assertEquals(5, result);
        System.out.println("Operation completed.");
    }

}