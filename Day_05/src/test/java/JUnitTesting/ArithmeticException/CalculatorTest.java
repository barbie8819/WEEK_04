package JUnitTesting.ArithmeticException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2), "10 / 2 should equal 5");
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

}