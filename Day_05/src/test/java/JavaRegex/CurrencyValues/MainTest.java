package JavaRegex.CurrencyValues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        String expected = "$45.99, 10.50";
        assertEquals(expected, Main.extractCurrencyValues(text));
    }

    @Test
    public void testNoCurrencyValues() {
        String text = "There are no prices here.";
        String expected = "";
        assertEquals(expected, Main.extractCurrencyValues(text));
    }

    @Test
    public void testMultipleCurrencyValues() {
        String text = "The total is $100.00, tax is 15.75, and the tip is $20.00.";
        String expected = "$100.00, 15.75, $20.00";
        assertEquals(expected, Main.extractCurrencyValues(text));
    }

}