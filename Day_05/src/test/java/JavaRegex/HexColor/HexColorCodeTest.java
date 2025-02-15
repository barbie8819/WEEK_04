package JavaRegex.HexColor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexColorCodeTest {
    @Test
    void testValidLicense() {
        assertTrue(JavaRegex.HexColor.HexColorCode.isValidHexCode("#FFA500"));
        assertTrue(JavaRegex.HexColor.HexColorCode.isValidHexCode("#ff4500"));
        assertTrue(JavaRegex.HexColor.HexColorCode.isValidHexCode("#123234"));
    }

    @Test
    void testInvalidLicense() {
        assertFalse(JavaRegex.HexColor.HexColorCode.isValidHexCode("123user"));
        assertFalse(JavaRegex.HexColor.HexColorCode.isValidHexCode("us"));
    }


}