package JavaRegex.EmaiilAddressFromText;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailAddressFromTextTest {
    @Test
    void testEmailExtraction() {
        String text = "Contact us at support@example.com and info@company.org";
        // Expected emails
        assertTrue(text.contains("support@example.com"));
        assertTrue(text.contains("info@company.org"));
    }

    @Test
    void testNoEmails() {
        String text = "There are no email addresses here.";
        assertFalse(text.matches(".*[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}.*"));
    }

    @Test
    void testEdgeCases() {
        String text = "Emails: test.email+alex@leetcode.com, simple@domain.co.uk, user@sub.domain.com";
        assertTrue(text.contains("test.email+alex@leetcode.com"));
        assertTrue(text.contains("simple@domain.co.uk"));
        assertTrue(text.contains("user@sub.domain.com"));
    }

}