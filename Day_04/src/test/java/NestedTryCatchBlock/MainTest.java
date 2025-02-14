package NestedTryCatchBlock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testValidDivision() {
        int[] array = {10, 20, 30, 40, 50};
        int result = array[2] / 5;
        assertEquals(6, result);
    }

    @Test
    public void testInvalidIndex() {
        int[] array = {10, 20, 30, 40, 50};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int result = array[7];
        });
    }

    @Test
    public void testDivisionByZero() {
        int[] array = {10, 20, 30, 40, 50};
        assertThrows(ArithmeticException.class, () -> {
            int result = array[1] / 0;
        });
    }
}