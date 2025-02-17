package JUnitTesting.UserRegistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserResgisterTest {
    private UserResgister registration;

    @BeforeEach
    void setUp() {
        registration = new UserResgister();
    }

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john.doe@example.com", "SecurePass1"));
    }

    @Test
    void testEmptyUsername() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "john.doe@example.com", "SecurePass1"));
        assertEquals("Username cannot be empty.", ex.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "invalid-email", "SecurePass1"));
        assertEquals("Invalid email format.", ex.getMessage());
    }

    @Test
    void testWeakPassword() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "john.doe@example.com", "weak"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", ex.getMessage());
    }

    @Test
    void testPasswordMissingUppercase() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "john.doe@example.com", "securepass1"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", ex.getMessage());
    }

    @Test
    void testPasswordMissingDigit() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "john.doe@example.com", "SecurePass"));
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", ex.getMessage());
    }

}