package JavaRegex.ValidDateFormate;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testValidDateFormate() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        assertTrue(text.contains("12/05/2023"));
        assertTrue(text.contains("15/08/2024"));
        assertTrue(text.contains("29/02/2020"));
    }

    @Test
    public void testNoDates() {
        String text = "There are no dates here.";
        assertFalse(text.matches(".*\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/\\d{4}\\b.*"));
    }



}
