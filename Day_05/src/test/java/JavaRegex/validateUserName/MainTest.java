package JavaRegex.validateUserName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testValidUsernames() {
        assertTrue(Main.isValidUsername("user_123"));
        assertTrue(Main.isValidUsername("UserName_01"));
        assertTrue(Main.isValidUsername("a12345"));
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(Main.isValidUsername("123user"));
        assertFalse(Main.isValidUsername("us")); 
          }



}