package JavaRegex.ValidateCreditCard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testValidVisaCard() {
        assertTrue(Main.CreditCardValidator.isValidCardNumber("4123456789012345"));
    }

    @Test
    public void testValidMasterCard() {
        assertTrue(Main.CreditCardValidator.isValidCardNumber("5123456789012345"));
    }

    @Test
    public void testInvalidCardShortLength() {
        assertFalse(Main.CreditCardValidator.isValidCardNumber("41234567890123"));
    }

    @Test
    public void testInvalidCardNonNumeric() {
        assertFalse(Main.CreditCardValidator.isValidCardNumber("41234567890123AB"));
    }

    @Test
    public void testInvalidCardWrongPrefix() {
        assertFalse(Main.CreditCardValidator.isValidCardNumber("3123456789012345"));
    }

}