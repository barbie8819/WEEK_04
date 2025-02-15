package JavaRegex.LicensePlateNumber;

import JavaRegex.LicensePlateNumber.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testValidLicense() {
        assertTrue(JavaRegex.LicensePlateNumber.Main.isValidLicense("AB1234"));
        assertTrue(JavaRegex.LicensePlateNumber.Main.isValidLicense("CD5432"));
        assertTrue(JavaRegex.LicensePlateNumber.Main.isValidLicense("DE3421"));
    }

    @Test
    void testInvalidLicense() {
        assertFalse(JavaRegex.LicensePlateNumber.Main.isValidLicense("123user"));
        assertFalse(JavaRegex.LicensePlateNumber.Main.isValidLicense("us"));
    }

}