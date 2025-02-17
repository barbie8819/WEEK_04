package JUnitTesting.DateFormatterTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    private DateFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new DateFormatter();
    }

    @Test
    void testValidDate() {
        assertEquals("17-02-2025", formatter.formatDate("2025-02-17"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("17-02-2025"));
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }



    @Test
    void testEmptyDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(""));
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }



}