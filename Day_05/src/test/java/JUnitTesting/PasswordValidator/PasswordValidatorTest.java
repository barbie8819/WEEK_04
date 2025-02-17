package JUnitTesting.PasswordValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong1Password"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Short1"));
    }

    @Test
    void testMissingUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testMissingDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }

    @Test
    void testMinimumLength() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testValidEdgeCase() {
        assertTrue(validator.isValid("A1bcdefg"));
    }

}