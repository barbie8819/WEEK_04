package JUnitTesting.CalculatorTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(5, 3), "5 + 3 should equal 8");
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.multiply(5, 3), "5 * 3 should equal 15");
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

}