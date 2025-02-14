package ExceptionPropagationInMethod;

import org.junit.jupiter.api.Test;

import static ExceptionPropagationInMethod.Main.method1;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testMethod1ThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            method1();
        });
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testMainHandlesException() {
        assertDoesNotThrow(() -> {
            ExceptionPropagationInMethod.Main.main(new String[]{});
        });
    }

}