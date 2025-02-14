package tryWithResources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.*;
class MainTest {
    @Test
    public void testFileReadingSuccess() throws IOException {
        File tempFile = File.createTempFile("info", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello, this is a test line!");
        }

        String result;
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile))) {
            result = reader.readLine();
        }  // File is automatically closed here

        assertEquals("Hello, this is a test line!", result);
    }

    @Test
    public void testFileNotFound() {
        File file = new File("non_existing_file.txt");

        IOException exception = assertThrows(IOException.class, () -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                reader.readLine();
            }
        });

        assertTrue(exception instanceof FileNotFoundException);
    }

}