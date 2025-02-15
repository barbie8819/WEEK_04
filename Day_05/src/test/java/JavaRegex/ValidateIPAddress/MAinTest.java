package JavaRegex.ValidateIPAddress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MAinTest {

    @Test
    public void testValidIP() {
        assertTrue(MAin.isValidAddress("192.168.1.1"));
        assertTrue(MAin.isValidAddress("255.255.255.255"));
        assertTrue(MAin.isValidAddress("0.0.0.0"));
    }

    @Test
    public void testInvalidIP() {
        assertFalse(MAin.isValidAddress("256.256.256.256"));
        assertFalse(MAin.isValidAddress("192.168.1"));
    }

  
}