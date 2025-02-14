package UncheckedException;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DivisionProgramTest {
    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            int result = divide(10, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testValidDivision() {
        assertEquals(5, divide(10, 2));
        assertEquals(3, divide(9, 3));
    }

    @Test
    public void testInvalidInput() {
        assertThrows(InputMismatchException.class, () -> {
            Scanner scanner = new Scanner("abc");
            scanner.nextInt();
        });
    }


    // Helper method for division
    private int divide(int a, int b) {
        return a / b;
    }

}