package AnnotationsJava.MaxLength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testValidUsername() {
        User user = new User("shortName");
        assertEquals("shortName", user.getUsername());
    }

    @Test
    public void testInvalidUsernameTooLong() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("thisIsTooLong");
        });
        assertEquals("Username cannot exceed 10 characters", exception.getMessage());
    }

    @Test
    public void testAnnotationValidation() {
        User user = new User("validName");
        Validator.validate(user); // Should pass without any exception
    }
}