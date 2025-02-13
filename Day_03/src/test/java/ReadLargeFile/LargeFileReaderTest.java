package ReadLargeFile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
class LargeFileReaderTest {
    @Test
    void testReadErrorLines() throws IOException {
        String testFile = "C:\\Users\\scc\\Downloads\\100mb-examplefile-com.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(testFile))) {
            bw.write("This is a test line.\n");
            bw.write("Error occurred here.\n");
            bw.write("Another line without issues.\n");
            bw.write("Critical ERROR detected.\n");
        }

        List<String> result = LargeFileReader.readErrorLines(testFile);

        assertEquals(2, result.size());
        assertTrue(result.get(0).toLowerCase().contains("error"));
        assertTrue(result.get(1).toLowerCase().contains("error"));

        new File(testFile).delete();
    }

}