package JavaRegex.ValidateSSN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testValidSSN() {
        String text = "My SSN is 123-45-6789.";
        String expected = "123-45-6789 is valid";
        assertEquals(expected, Main.validateSSN(text), "The SSN should be valid");
    }

    @Test
    void testInvalidSSN() {
        String text = "My SSN is 123456789.";
        String expected = " No valid SSN found";
        assertEquals(expected, Main.validateSSN(text), "The SSN should be invalid");
    }

}